package com.strategy.sanGuo;

/**
 * ����
 * @author gong_pibao
 */
public class Context {
	private IStrategy stragegy ;
	//���캯������Ҫʹ���ĸ����
	public Context(IStrategy stragegy){
		this.stragegy = stragegy;
	}
	//ʹ�ü�ı��
	public void operate(){
		this.stragegy.operate();
	}
}
