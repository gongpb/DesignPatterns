package com.command.group;

public class Client {
	public static void main(String[] args) {
		//定义我们的接口人
		Invoker xiaoSan = new Invoker();
		System.out.println("-------------客户要求增加一项----------");
		//客户下达命令
		Command command = new AddRequirementCommand();
		//接头人接受命令
		xiaoSan.setCommand(command);
		//接头人执行命令
		xiaoSan.action();
		System.out.println("\n---------执行第二个命令-------");
		Command commanddelete = new DeletePageCommand();
		xiaoSan.setCommand(commanddelete);
		xiaoSan.action();
		
	}
}
