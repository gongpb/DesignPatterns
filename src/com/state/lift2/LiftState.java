package com.state.lift2;

public abstract class LiftState {
	//����һ��������ɫ��Ҳ���Ƿ�װ״̬�ı仯����Ĺ��ܱ仯
	protected Context context;
	public void setContext(Context context) {
		this.context = context;
	}
	//���ݿ�������
	public abstract void open();
	//�رն���
	public abstract void close();
	//����
	public abstract void run();
	//ֹͣ
	public abstract void stop();
}
