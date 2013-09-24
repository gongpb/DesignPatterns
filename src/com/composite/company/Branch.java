package com.composite.company;

import java.util.ArrayList;
/**
 * ��֧�Ľڵ�ʵ��
 * @author gong_pibao
 */
public class Branch implements IBranch{
	//�洢�ӽڵ����Ϣ
	private ArrayList subordinateList = new ArrayList();
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
	//����һ������֦�ڵ�
	@Override
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}
	//����һ��Ҷ�ӽڵ�
	@Override
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}
	//��ȡ�Լ���֦�������Ϣ
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
	public ArrayList getSubordinateInfo() {

		return this.subordinateList;
	}
	
}
