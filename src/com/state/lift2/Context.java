package com.state.lift2;

/**
 * Context是一个环境角色，它的作用就是各个状态的过渡，
 * LiftState抽象类中我们定义并把这个环境角色聚合进来，
 * 并传递到子类，也就是4个具体的实现类中自己根据环境来
 * 决定如何进行状态的过渡
 * @author gong_pibao
 */
public class Context {
	//定义出所有电梯的状态
	public final static OpenningState openningState = new OpenningState(); 
	public final static ClosingState  closingStete  = new ClosingState();
	public final static RunningState  runningState  = new RunningState();
	public final static StoppingState stoppingState = new StoppingState();
	//当前电梯的状态
	private LiftState liftState;
	public LiftState getLiftState() {
		return liftState;
	}
	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		//把当前的环境通知给各个实现类
		this.liftState.setContext(this);
	}
	//行为委托
	public void open(){
		this.liftState.open();
	}
	public void close (){
		this.liftState.close();
	}
	public void run(){
		this.liftState.run();
	}
	public void stop(){
		this.liftState.stop();
	}

}
