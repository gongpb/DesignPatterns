package com.command.group;

public class Client {
	public static void main(String[] args) {
		//�������ǵĽӿ���
		Invoker xiaoSan = new Invoker();
		System.out.println("-------------�ͻ�Ҫ������һ��----------");
		//�ͻ��´�����
		Command command = new AddRequirementCommand();
		//��ͷ�˽�������
		xiaoSan.setCommand(command);
		//��ͷ��ִ������
		xiaoSan.action();
		System.out.println("\n---------ִ�еڶ�������-------");
		Command commanddelete = new DeletePageCommand();
		xiaoSan.setCommand(commanddelete);
		xiaoSan.action();
		
	}
}
