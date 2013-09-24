package com.command.command;

/**
 * �����������2
 * @author gong_pibao
 */
public class ConcreteCommand2 extends Command{
	private Receiver receiver;
	public ConcreteCommand2(Receiver receiver){
		this.receiver = receiver;
	}
	//����ʵ��һ��ִ������
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
