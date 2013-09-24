package com.strategy.strategy;
/**
 * 策略模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		Context context ;
		//运算法则1
		context = new Context(new ConcreteStrategy1());
		context.doSomething(); //执行封装后的方法1
		System.out.println("\n");
		
		context = new Context(new ConcreteStrategy2());
		context.doSomething(); ////执行封装后的方法2
	}

}
