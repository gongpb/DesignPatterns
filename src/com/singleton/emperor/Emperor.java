package com.singleton.emperor;

public class Emperor {
	private static final Emperor emperor = new Emperor(); //��ʼ��һ���ʵ�
	private Emperor(){
		//Ŀ���ǲ������ڶ����ʵ�
	}
	public static Emperor getInstance(){
		return emperor;
	}
	//�ʵ�˵����
	public static void say(){
		System.out.println("���ǻʵ�ĳĳ...........");
	}
}
