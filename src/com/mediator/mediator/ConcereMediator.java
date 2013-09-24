package com.mediator.mediator;

/**
 * 具体中介者角色
 * 通过协调各同事角色实现协作行为，因此，它必须依赖于各个同事角色
 * @author gong_pibao
 */
public class ConcereMediator extends Mediator{
	/**
	 * 中介者所有的方法doSomething1和doSomething2 都是比较复杂的业务逻辑，
	 * 为同事类服务，其实现是要依赖各个同事类来完成的
	 */
	@Override
	public void doSomething1() {
		//调用同事类的方法，只要是public的方法，都可以调用
		super.c1.depMethod1();
		super.c2.depMethod2();
	}

	@Override
	public void doSomething2() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}
}
