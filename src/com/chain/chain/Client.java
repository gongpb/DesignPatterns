package com.chain.chain;

/**
 * ������ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		//�������Ľ׶�˳�� 1--2--3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		//�ύ���󣬷��ؽ��
		Response response = handler1.handlerMessage(new Request());
	}
}
