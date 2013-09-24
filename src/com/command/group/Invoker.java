package com.command.group;

public class Invoker {
	//什么命令
	private Command command;
	//执行客户的命令
	public void action()
	{
		this.command.execute();
	}
	//向客户发出命令
	public void setCommand(Command command) 
	{
		this.command = command;
	}
}
