package com.strategy.sanGuo;

public class ZhaoYun {
	public static void main(String[] args) {
		Context context ;
		//�յ������ʱ�򣬲𿪵�һ��
		System.out.println("-----�ոյ������ʱ��𿪵�һ��------");
		context = new Context(new BackDoor());  //�õ����
		context.operate(); // ��ִ��
		System.out.println("\n");
		
		//�����ֲ�˼�� ���𿪵ڶ�����
		System.out.println("------�����ֲ�˼�� ���𿪵ڶ�����-----");
		context = new Context(new GivenGreenLight());
		context.operate(); // ִ���˵ڶ�������
		
		System.out.println("\n");
		//��Ȩ��С��׷�ˣ�զ�죬�������
		System.out.println("------��Ȩ��С��׷�ˣ�զ�죬�������------");
		context = new Context(new BlockEnemy());
		context.operate(); //����˶Ϻ�
	}
}
