package com.iterator.project;

public class Project implements IProject{
	private String name = "";
	//��Ŀ��Ա����
	private int num = 0;
	//��Ŀ����
	private int cost = 0;
	//����һ�����췽�����������ϰ��뿴�ĵ���Ϣ�洢����
	public Project (String name, int num, int cost){
		//��ֵ��������ĳ�Ա������
		this.name = name;
		this.num  = num;
		this.cost = cost;
	}
	//��ȡ��Ŀ��Ϣ
	@Override
	public String getProjectInfo() {
		String info = "";
		//��ȡ��Ŀ������
		info = info +"  ��Ŀ�������ǣ� "+ this.name;
		info = info +"\t��Ŀ������ " + this.num;
		info = info +"\t��Ŀ���ã� " + this.cost;
		return info;
	}
	
}
