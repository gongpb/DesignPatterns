package com.state.lift2;

public class OpenningState extends LiftState{
	//���ݵĿ��ع���
	@Override
	public void close() {
		//�ı�״̬
		super.context.setLiftState(Context.closingStete);
		//����ί�и�CloseStete��ִ��
		super.context.getLiftState().close();
	}

	@Override
	public void open() {
		System.out.println("�����ſ���.....");
	}
	//�����ſ�����ʱ�� ��������
	@Override
	public void run() {
		
	}
	//�����ſ�����ʱ�����Ѿ���ֹͣ״̬��
	@Override
	public void stop() {
		
	}

}
