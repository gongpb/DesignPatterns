package com.composite.company;

/**
 * Ҷ�ӽڵ��ʵ��
 * @author gong_pibao
 */
public class Leaf implements ILeaf{
	//Ҷ�ӵ�����
	private String name = "";
	//Ҷ�ӵ�ְλ
	private String position = "";
	//Ҷ�ӵ�нˮ
	private int salary = 0;
	//ͨ�����췽������Ҷ�ӵ���Ϣ
	public Leaf(String name , String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//��С��С����ֻ�ܻ���Լ�����Ϣ��
	@Override
	public String getInfo() {
		String info = "";
		info = "���ƣ�" + this.name;
		info = info +"\t ְλ��" +this.position;
		info = info +"\t нˮ��" +this.salary;
		return info;
	}
	

}
