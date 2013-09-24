package com.state.lift;

public interface ILift {
	public static final int STATE_OPENING = 1; //����
	public static final int STATE_CLOSING = 2; //����
	public static final int STATE_RUNNING = 3; //����
	public static final int STATE_STOPPING= 4; //ֹͣ
	
	//���õ���״̬
	public void setState(int state);
	//���ݿ�������
	public void open();
	//�رն���
	public void close();
	//����
	public void run();
	//ֹͣ
	public void stop();
}
