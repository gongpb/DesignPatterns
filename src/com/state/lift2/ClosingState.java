package com.state.lift2;

public class ClosingState extends LiftState {
	//电梯门关闭
	@Override
	public void close() {
		System.out.println("电梯门关闭......");
	}
	//电梯门开启
	@Override
	public void open() {
		super.context.setLiftState(Context.openningState);
		super.context.open();
	}
	//电梯门关闭就运行，很正常
	@Override
	public void run() {
		super.context.setLiftState(Context.runningState);
		super.context.run();
	}
	//电梯门关闭着，我就不按楼层，电梯停止
	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState);
		super.context.stop();
	}
	

}
