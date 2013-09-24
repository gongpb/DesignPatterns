package com.bridge.bridge;
/**
 * 桥梁模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//定义一个是实现化角色
		Implementor imp = new ConcreteImplementor1();
		//定义一个抽象化角色
		Abstraction abs = new RefinedAbstraction(imp);
		//执行行文
		abs.request();
	}
}
