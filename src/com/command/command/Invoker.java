package com.command.command;

/**
 * ��������
 * �����߾�����һ��������������ʲô��������н���ִ��
 * @author gong_pibao
 */
public class Invoker {
	private Command command;
	//��������
	public void setCommand(Command command) {
		this.command = command;
	}
	//ִ������
	public  void action(){
		this.command.execute();
	}
}
