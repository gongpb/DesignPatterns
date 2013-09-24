package com.command.command;

/**
 * �����������
 * @author gong_pibao
 */
public class ConcreteCommand1 extends Command{
	private Receiver receiver;
	public ConcreteCommand1(Receiver receiver){
		this.receiver = receiver;
	}
	//����ִ��һ������
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
