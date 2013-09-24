package com.state.lift2;

public class StoppingState extends LiftState {
	//ֹͣ״̬�������ű������ǹرյ�
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	//�����ſ���
	@Override
	public void open() {
		super.context.setLiftState(Context.openningState);
		super.context.open();
	}
	//����
	@Override
	public void run() {
		super.context.setLiftState(Context.runningState);
		super.context.run();
	}
	//ֹͣ
	@Override
	public void stop() {
		System.out.println("����ֹͣ......");
	}

}
