package com.bridge.company2;

public abstract class Corp {
	private Product prodduct;
	public Corp(Product product){
		this.prodduct = product;
	}
	//公司赚钱
	public void makeMoney(){
		this.prodduct.beProducted(); //生产
		this.prodduct.beSelled();    //销售
	}
}
