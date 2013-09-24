package com.state.lift;

public class Lift implements ILift {
	private int state;
	//设置电梯状态 
	@Override
	public void setState(int state) {
		this.state = state;
	}
	//电梯关闭
	@Override
	public void close() {
		switch (this.state){
		case STATE_OPENING: 
							this.closeWithOutLogic();
							this.setState(STATE_CLOSING);
			    			break;
		case STATE_CLOSING: 
							//do nothing
							break;
		case STATE_RUNNING: 
							//do nothing
							break;
		case STATE_STOPPING: 
							//do nothing
							break;
		}
	}
	@Override
	public void open() {
		switch (this.state){
		case STATE_OPENING: 
							//do nothing
			    			break;
		case STATE_CLOSING: 
							this.openWithOutLogic();
							this.setState(STATE_OPENING);
							break;
		case STATE_RUNNING: 
							//do nothing
							break;
		case STATE_STOPPING: 
							this.openWithOutLogic();
							this.setState(STATE_OPENING);
							break;
		}
	}

	@Override
	public void run() {
		switch (this.state){
		case STATE_OPENING: 
							//do nothing
			    			break;
		case STATE_CLOSING: 	//闭门状态可以运行
							this.runWithOutLogic();
							this.setState(STATE_RUNNING);
							break;
		case STATE_RUNNING: 
							//do nothing
							break;
		case STATE_STOPPING:    //停止状态可以运行
							this.runWithOutLogic();
							this.setState(STATE_RUNNING);
							break;
		}
	}
	@Override
	public void stop() {
		switch (this.state){
		case STATE_OPENING: 
							//do nothing
			    			break;
		case STATE_CLOSING:  //闭门状态可以停止
							this.stopWithOutLogic();
							this.setState(STATE_STOPPING);
							break;
		case STATE_RUNNING:  //运行状态可以停止
							this.stopWithOutLogic();
							this.setState(STATE_STOPPING);
							break;
		case STATE_STOPPING: 
							//do nothing
							break;
		}
	}
	//纯粹的电梯关门，不考虑实际的逻辑
	public void closeWithOutLogic(){
		System.out.println("电梯关门");
	}
	public void openWithOutLogic(){
		System.out.println("电梯开启");
	}
	public void runWithOutLogic(){
		System.out.println("电梯运行");
	}
	public void stopWithOutLogic(){
		System.out.println("电梯停止");
	}

}
