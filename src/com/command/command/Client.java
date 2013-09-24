package com.command.command;
/**
 * ����ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//����������(�ӿ���)
		Invoker invoker = new Invoker();
		//����һ��������
		Receiver receiver = new ConcreteReceiver1();
		//����һ�����͸������ߵ�����
		Command command = new ConcreteCommand1(receiver);
		//�����������ȥִ��
		invoker.setCommand(command);
		invoker.action();
		System.out.println("-------\n");
		
	}
}
