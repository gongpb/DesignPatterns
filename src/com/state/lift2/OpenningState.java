package com.state.lift2;

public class OpenningState extends LiftState{
	//电梯的开关功能
	@Override
	public void close() {
		//改变状态
		super.context.setLiftState(Context.closingStete);
		//动作委托给CloseStete来执行
		super.context.getLiftState().close();
	}

	@Override
	public void open() {
		System.out.println("电梯门开启.....");
	}
	//电梯门开启的时候， 不能运行
	@Override
	public void run() {
		
	}
	//电梯门开启的时候吗，已经是停止状态了
	@Override
	public void stop() {
		
	}

}
