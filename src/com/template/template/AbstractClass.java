package com.template.template;

public abstract class AbstractClass {
	//基本方法
	protected abstract void doSomething();
	//基本方法
	protected abstract void doAnything();
	//模板方法
	public void templateMethod(){
		/**
		 * 调用基本方法，处理业务逻辑
		 */
		this.doAnything();
		this.doSomething();
	}
}
