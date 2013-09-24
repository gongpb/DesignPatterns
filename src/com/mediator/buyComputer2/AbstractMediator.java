package com.mediator.buyComputer2;
/**
 * �����н���
 * @author gong_pibao
 */
public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	//���캯��(ע��ͬ����)
	public AbstractMediator(){
		this.purchase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}
	//�н�������Ҫ�ķ��� �����¼�����������������֮��Ĺ�ϵ
	public abstract void execute(String str, Object...objects);
}
