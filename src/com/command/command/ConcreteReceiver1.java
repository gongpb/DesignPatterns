package com.command.command;
/**
 * 具体的执行方类
 * @author gong_pibao
 */
public class ConcreteReceiver1 extends Receiver {

	@Override
	public void doSomething() {
		//每个接受者都必须处理一定的业务逻辑
		System.out.println("接收者--1--进行处理");
	}

}
