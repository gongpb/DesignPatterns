package com.template.template;

public abstract class AbstractClass {
	//��������
	protected abstract void doSomething();
	//��������
	protected abstract void doAnything();
	//ģ�巽��
	public void templateMethod(){
		/**
		 * ���û�������������ҵ���߼�
		 */
		this.doAnything();
		this.doSomething();
	}
}
