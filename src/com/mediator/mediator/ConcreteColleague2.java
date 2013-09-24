package com.mediator.mediator;

public class ConcreteColleague2 extends Colleague{
	/**
	 * 通过构造方法传递中介者
	 * 为什么同事类要使用构造函数注入中介者，而中介者使用getter/setter方式注入同事类呢？
	 * 这是因为同事类必须有中介者，而中介者可以只有部分同事类
	 * @param mediator
	 */
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	//自有方法
	public void selfMethod2(){
		//处理自己的业务逻辑
	}
	//依赖方法
	public void depMethod2(){
		//处理自己的业务逻辑
		//自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething2();
	}
}
