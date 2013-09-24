package com.composite.company;

import java.util.ArrayList;
/**
 * ���ڵ��ʵ��
 * @author gong_pibao
 */
public class Root implements IRoot{
	//������ڵ��µ���֦�ڵ㡢��Ҷ�ڵ�  ,Subordinate����˼���¼�
	private ArrayList subordinateList = new ArrayList();
	//���ڵ������
	private String name = "";
	//���ڵ��ְλ
	private String position = "";
	//���ڵ��нˮ
	private  int salary = 0;
	//ͨ�����췽�������ܾ������Ϣ
	public Root(String name , String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//������֦�ڵ�
	@Override
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}
	
	//�����ӽڵ㣬�������飬ֱ���������ܾ���
	@Override
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}
	//����Լ�����Ϣ
	@Override
	public String getInfo() {
		String info = "";
		info = "���ƣ�" + this.name;
		info = info +"ְλ��"  +this.position;
		info = info +"нˮ��"  +this.salary;
		return info;
	}
	//�õ��¼�����Ϣ
	@Override
	public ArrayList getSubordinateInfo() {
		return this.subordinateList;
	}

}
