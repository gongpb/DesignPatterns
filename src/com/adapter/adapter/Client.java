package com.adapter.adapter;
/**
 * 适配器模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		//增加了适配器角色之后的业务逻辑
		Target targetAdapter = new Adapter();
		targetAdapter.request();
	}
}
