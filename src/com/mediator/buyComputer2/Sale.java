package com.mediator.buyComputer2;

import java.util.Random;

/**
 * 销售管理(具体同事类)
 * @author gong_pibao
 */
public class Sale extends AbstractColleague{
	public Sale(AbstractMediator mediator) {
		super(mediator);
	}
	//销售IBM电脑
	public void sellIBMComputer(int num){
		super.mediator.execute("sale.sell", num);
		System.out.println("销售IBM电脑为："+num);
	}
	//反馈销售情况 0~100之间变化，0代表根本没有人买，100 代表非常畅销，出一个卖一个
	public int getSaleStatus(){
		Random rand = new Random();
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM电脑的销售情况为："+saleStatus);
		return saleStatus;
	}
	//折价处理
	public void offSale(){
		//库房有多少卖多少
		super.mediator.execute("sale.offsell");
	}
}
