package com.memento.boy2;

public class Client {
	public static void main(String[] args) {
		//��������
		Boy boy = new Boy();
		//��ʼ����ǰ״̬
		boy.setState("����ܰ�");
		System.out.println("======�к������ڵ�״̬=====");
		System.out.println(boy.getState());
		//��Ҫ��¼�µ�ǰ״̬
		Memento mem = boy.createMemento();
		//�к�ȥ׷Ů����״̬�ı�
		boy.changeState();
		System.out.println("\n======�к�׷Ů�����״̬======");
		System.out.println(boy.getState());
		//׷Ů��ʧ�ܣ��ָ�ԭ״
		boy.setState(mem.getState());
		System.out.println("\n======�к��ָ����״̬======");
		System.out.println(boy.getState());
		
	}
}
