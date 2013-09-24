package com.command.command;
/**
 * 命令模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//声明调用者(接口人)
		Invoker invoker = new Invoker();
		//定义一个接收者
		Receiver receiver = new ConcreteReceiver1();
		//定义一个发送给接收者的命令
		Command command = new ConcreteCommand1(receiver);
		//命令交给调用者去执行
		invoker.setCommand(command);
		invoker.action();
		System.out.println("-------\n");
		
	}
}
