package com.state.lift2;

public class RunningState extends LiftState{
	//电梯处于运行状态，不能关闭
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	//电梯处于运行状态，不能开门
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		System.out.println("电梯运行......");
		
	}
	//电梯停止
	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState);
		super.context.stop();
	}

}
