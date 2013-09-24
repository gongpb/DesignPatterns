package com.state.lift;

public interface ILift {
	public static final int STATE_OPENING = 1; //敞门
	public static final int STATE_CLOSING = 2; //关门
	public static final int STATE_RUNNING = 3; //运行
	public static final int STATE_STOPPING= 4; //停止
	
	//设置电梯状态
	public void setState(int state);
	//电梯开启动作
	public void open();
	//关闭动作
	public void close();
	//运行
	public void run();
	//停止
	public void stop();
}
