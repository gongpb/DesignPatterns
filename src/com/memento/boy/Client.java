package com.memento.boy;

public class Client {
	public static void main(String[] args) {
		//��������
		Boy boy = new Boy();
		//��ʼ����ǰ״̬
		boy.setState("����ܰ�");
		System.out.println("======�к������ڵ�״̬=====");
		System.out.println(boy.getState());
		//��Ҫ��¼�µ�ǰ״̬
		Boy backup = new Boy();
		backup.setState(boy.getState());
		//�к�ȥ׷Ů����״̬�ı�
		boy.changeState();
		System.out.println("\n======�к�׷Ů�����״̬======");
		System.out.println(boy.getState());
		//׷Ů��ʧ�ܣ��ָ�ԭ״
		boy.setState(backup.getState());
		System.out.println("\n======�к��ָ����״̬======");
		System.out.println(boy.getState());
		
	}
}
