package com.state.lift2;

public class StoppingState extends LiftState {
	//停止状态，电梯门本来就是关闭的
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	//电梯门开启
	@Override
	public void open() {
		super.context.setLiftState(Context.openningState);
		super.context.open();
	}
	//运行
	@Override
	public void run() {
		super.context.setLiftState(Context.runningState);
		super.context.run();
	}
	//停止
	@Override
	public void stop() {
		System.out.println("电梯停止......");
	}

}
