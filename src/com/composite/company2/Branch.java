package com.composite.company2;

import java.util.ArrayList;
/**
 * ��֧�Ľڵ�ʵ��
 * @author gong_pibao
 */
public class Branch implements IBranch{
	//�洢�ӽڵ����Ϣ(�쵼���滹���¼��쵼��С��)
	private ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
	//��֦�ڵ������
	private String name = "";
	//��֦�ڵ��ְλ
	private String position = "";
	//��֦�ڵ��нˮ
	private int salary = 0;
	//ͨ�����췽��������֦�ڵ����Ϣ
	public Branch(String name , String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	//����һ���������������¼��쵼��Ҳ������С��
	@Override
	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}
	
	//��ȡ�Լ���֦�ڵ����Ϣ
	@Override
	public String getInfo() {
		String info = "";
		info = "���ƣ�" + this.name;
		info = info +"\t ְλ��" +this.position;
		info = info +"\t нˮ��" +this.salary;
		return info;
	}
	//����¼�����Ϣ
	@Override
	public ArrayList<ICorp> getSubordinateInfo() {
		return this.subordinateList;
	}
}
