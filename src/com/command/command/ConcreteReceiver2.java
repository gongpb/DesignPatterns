package com.command.command;
/**
 * 具体的执行方类
 * @author gong_pibao
 */
public class ConcreteReceiver2 extends Receiver{
	//每个接受者都必须处理一定的业务逻辑
	@Override
	public void doSomething() {
		System.out.println("接收者--2--进行处理");
	}

}
