package com.strategy.strategy;
/**
 * ����ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		Context context ;
		//���㷨��1
		context = new Context(new ConcreteStrategy1());
		context.doSomething(); //ִ�з�װ��ķ���1
		System.out.println("\n");
		
		context = new Context(new ConcreteStrategy2());
		context.doSomething(); ////ִ�з�װ��ķ���2
	}

}
