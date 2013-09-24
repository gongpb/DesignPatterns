package com.state.lift2;

public class ClosingState extends LiftState {
	//�����Źر�
	@Override
	public void close() {
		System.out.println("�����Źر�......");
	}
	//�����ſ���
	@Override
	public void open() {
		super.context.setLiftState(Context.openningState);
		super.context.open();
	}
	//�����Źرվ����У�������
	@Override
	public void run() {
		super.context.setLiftState(Context.runningState);
		super.context.run();
	}
	//�����Źر��ţ��ҾͲ���¥�㣬����ֹͣ
	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState);
		super.context.stop();
	}
	

}
