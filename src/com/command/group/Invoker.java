package com.command.group;

public class Invoker {
	//ʲô����
	private Command command;
	//ִ�пͻ�������
	public void action()
	{
		this.command.execute();
	}
	//��ͻ���������
	public void setCommand(Command command) 
	{
		this.command = command;
	}
}
