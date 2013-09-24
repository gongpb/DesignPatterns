package com.template.hummer2;
/**
 * ������ģ��
 * @author gong_pibao
 */
public abstract class HummerModel {
	//ģ������
	public abstract void start();
	//ֹͣ
	public abstract void stop();
	//���ȷ�������
	public abstract void alarm();
	//���淢��¡¡������
	public abstract void engineBoom();
	//������
	public  void run(){
		//�ȷ�������
		this.start();
		//���濪ʼ����
		this.engineBoom();
		//������
		if(this.isAlarm())
		{
			this.alarm();
		}
		//����Ŀ�ĵؾ�ֹͣ
		this.stop();
	}
	
	//���ӷ�����Ĭ������˭�����
	protected boolean isAlarm(){
		return true;
	}
}
