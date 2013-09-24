package com.adapter.adapter;

/**
 * ÊÊÅäÆ÷½ÇÉ«
 * @author gong_pibao
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.doSomething();
	}
}
