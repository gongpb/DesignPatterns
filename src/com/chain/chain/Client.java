package com.chain.chain;

/**
 * 责任链模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		//设置链的阶段顺序 1--2--3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		//提交请求，返回结果
		Response response = handler1.handlerMessage(new Request());
	}
}
