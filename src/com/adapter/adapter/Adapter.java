package com.adapter.adapter;

/**
 * ��������ɫ
 * @author gong_pibao
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.doSomething();
	}
}
