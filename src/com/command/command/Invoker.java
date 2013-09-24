package com.command.command;

/**
 * 调用者类
 * 调用者就像是一个大气包，不管什么命令，都不行接受执行
 * @author gong_pibao
 */
public class Invoker {
	private Command command;
	//接受命令
	public void setCommand(Command command) {
		this.command = command;
	}
	//执行命令
	public  void action(){
		this.command.execute();
	}
}
