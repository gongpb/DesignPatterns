package com.mediator.buyComputer;

import java.util.Random;

/**
 * 销售管理
 * @author gong_pibao
 */
public class Sale {
	//销售IBM电脑
	public void sellIBMComputer(int num){
		//访问库存
		Stock stock = new Stock();
		//访问采购
		Purchase purchase = new Purchase();
		if(stock.getStockNum() < num) //库存数量不够销售
		{
			purchase.buyIBMcomputer(num);
		}
		System.out.println("销售IBM电脑为："+num);
		stock.decrease(num);
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
		Stock stock = new Stock();
		System.out.println("折扣销售IBM电脑      "+stock.getStockNum()+"  台");
	}
}
