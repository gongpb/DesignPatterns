package com.bridge.company2;

public abstract class Corp {
	private Product prodduct;
	public Corp(Product product){
		this.prodduct = product;
	}
	//��˾׬Ǯ
	public void makeMoney(){
		this.prodduct.beProducted(); //����
		this.prodduct.beSelled();    //����
	}
}
