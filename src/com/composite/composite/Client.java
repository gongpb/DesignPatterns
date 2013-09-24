package com.composite.composite;

public class Client {
	public static void main(String[] args) {
		//����һ�����ڵ�
		Composite root = new Composite();
		root.doSomething();
		//����һ����֦
		Composite branch = new Composite();
		//����һ����Ҷ�ڵ�
		Leaf leaf = new Leaf();
		//��������
		root.add(branch);
		branch.add(leaf);
		
	}
	
	//ͨ���ݹ������
	public static void display(Composite root){
		for(Component c:root.getChildren())
		{
			if(c instanceof Leaf) //��Ҷ�ڵ�
			{
				c.doSomething();
			}
			else //��֦�ڵ�
			{
				display((Composite)c);
			}
		}
	}
}
