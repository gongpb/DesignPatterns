package com.command.command;

/**
 * 具体的命令类2
 * @author gong_pibao
 */
public class ConcreteCommand2 extends Command{
	private Receiver receiver;
	public ConcreteCommand2(Receiver receiver){
		this.receiver = receiver;
	}
	//必须实现一个执行命令
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
