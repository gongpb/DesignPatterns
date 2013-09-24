package com.builder.carModel;

import java.util.ArrayList;

public abstract class CarModel {
	//��������Ǹ�������ִ�е�˳��
	private ArrayList<String> sequence = new ArrayList<String>();
	//ģ�������Ϳ�ʼ����
	protected abstract void start();
	//ֹͣ
	protected abstract void stop();
	//���ȷ�������
	protected abstract void alarm();
	//���淢��¡¡������
	protected abstract void engineBoom();
	
	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
	//ģ�ͻ���
	final public void run(){
		//ִ��һ�飬˭��ǰ������ִ��˭
		for(int i=0; i<this.sequence.size(); i++){
			String actionName = sequence.get(i);
			if(actionName.equalsIgnoreCase("start"))
			{
				this.start();
			}
			else  if(actionName.equalsIgnoreCase("stop"))
			{
				this.stop();
			}
			else if(actionName.equalsIgnoreCase("alarm"))
			{
				this.alarm();
			}
			else if(actionName.equalsIgnoreCase("engineBoom"))
			{
				this.engineBoom();
			}
		}
	}
}
