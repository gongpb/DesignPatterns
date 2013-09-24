package com.iterator.project2;

import java.util.ArrayList;

public class Project implements IProject{
	//����һ����Ŀ�б������е���Ŀ��������
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	private String name = "";
	//��Ŀ��Ա����
	private int num = 0;
	//��Ŀ����
	private int cost = 0;
	public Project (){
		
	}
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
	//������Ŀ
	@Override
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project (name, num, cost));
	}
	//����һ����������
	@Override
	public IProjectIterator iterator() {
		
		return new ProjectIterator(this.projectList);
	}
	
}
