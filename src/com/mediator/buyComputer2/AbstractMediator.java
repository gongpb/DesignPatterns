package com.mediator.buyComputer2;
/**
 * 抽象中介者
 * @author gong_pibao
 */
public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	//构造函数(注入同事类)
	public AbstractMediator(){
		this.purchase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}
	//中介者最重要的方法 叫做事件方法，处理多个对象之间的关系
	public abstract void execute(String str, Object...objects);
}
