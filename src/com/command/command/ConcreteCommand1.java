package com.command.command;

/**
 * 具体的命令类
 * @author gong_pibao
 */
public class ConcreteCommand1 extends Command{
	private Receiver receiver;
	public ConcreteCommand1(Receiver receiver){
		this.receiver = receiver;
	}
	//必须执行一个命令
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
