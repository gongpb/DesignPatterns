package com.state.lift;

public class Lift implements ILift {
	private int state;
	//���õ���״̬ 
	@Override
	public void setState(int state) {
		this.state = state;
	}
	//���ݹر�
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
		case STATE_CLOSING: 	//����״̬��������
							this.runWithOutLogic();
							this.setState(STATE_RUNNING);
							break;
		case STATE_RUNNING: 
							//do nothing
							break;
		case STATE_STOPPING:    //ֹͣ״̬��������
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
		case STATE_CLOSING:  //����״̬����ֹͣ
							this.stopWithOutLogic();
							this.setState(STATE_STOPPING);
							break;
		case STATE_RUNNING:  //����״̬����ֹͣ
							this.stopWithOutLogic();
							this.setState(STATE_STOPPING);
							break;
		case STATE_STOPPING: 
							//do nothing
							break;
		}
	}
	//����ĵ��ݹ��ţ�������ʵ�ʵ��߼�
	public void closeWithOutLogic(){
		System.out.println("���ݹ���");
	}
	public void openWithOutLogic(){
		System.out.println("���ݿ���");
	}
	public void runWithOutLogic(){
		System.out.println("��������");
	}
	public void stopWithOutLogic(){
		System.out.println("����ֹͣ");
	}

}
