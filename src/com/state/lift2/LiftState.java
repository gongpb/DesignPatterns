package com.state.lift2;

public abstract class LiftState {
	//定义一个环境角色，也就是封装状态的变化引起的功能变化
	protected Context context;
	public void setContext(Context context) {
		this.context = context;
	}
	//电梯开启动作
	public abstract void open();
	//关闭动作
	public abstract void close();
	//运行
	public abstract void run();
	//停止
	public abstract void stop();
}
