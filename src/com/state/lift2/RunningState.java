package com.state.lift2;

public class RunningState extends LiftState{
	//���ݴ�������״̬�����ܹر�
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	//���ݴ�������״̬�����ܿ���
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		System.out.println("��������......");
		
	}
	//����ֹͣ
	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState);
		super.context.stop();
	}

}
