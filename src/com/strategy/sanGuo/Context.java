package com.strategy.sanGuo;

/**
 * 锦囊
 * @author gong_pibao
 */
public class Context {
	private IStrategy stragegy ;
	//构造函数，你要使用哪个妙计
	public Context(IStrategy stragegy){
		this.stragegy = stragegy;
	}
	//使用计谋了
	public void operate(){
		this.stragegy.operate();
	}
}
