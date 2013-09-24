package com.composite.company3;

/**
 * ��Ҷ�ӿ�
 * @author gong_pibao
 */
public abstract class Corp {
	//��˾ÿ���˶����Լ�������
	private String name = "";
	//��˾ÿ���˶����Լ���ְλ
	private String position = "";
	//ÿ���˶����Լ���нˮ
	private int salary = 0;
	//ͨ�����췽������Ҷ�ӵ���Ϣ
	public Corp(String name , String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//����Լ�����Ϣ
	public String getInfo(){
		String info = "";
		info = "���ƣ�" + this.name;
		info = info +"\t ְλ��" +this.position;
		info = info +"\t нˮ��" +this.salary;
		return info;
	}
}
