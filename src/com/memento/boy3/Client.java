package com.memento.boy3;

public class Client {
	public static void main(String[] args) {
		//��������
		Boy boy = new Boy();
		//��������¼�Ĺ�����
		Caretaker caretaker = new Caretaker();
		//��ʼ����ǰ״̬
		boy.setState("����ܰ�");
		System.out.println("======�к������ڵ�״̬=====");
		System.out.println(boy.getState());
		//��Ҫ��¼�µ�ǰ״̬
		caretaker.setMemento(boy.createMemento());
		//�к�ȥ׷Ů����״̬�ı�
		boy.changeState();
		System.out.println("\n======�к�׷Ů�����״̬======");
		System.out.println(boy.getState());
		//׷Ů��ʧ�ܣ��ָ�ԭ״
		boy.restoreMemento(caretaker.getMemento());
		System.out.println("\n======�к��ָ����״̬======");
		System.out.println(boy.getState());
		
	}
}
