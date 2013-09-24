package com.mediator.buyComputer;

/**
 * 库存管理
 * @author gong_pibao
 */
public class Stock {
	//刚开始有100台电脑
	private static int COMPUTER_NUM = 100;
	//库存增加
	public void increase(int num){
		COMPUTER_NUM = COMPUTER_NUM + num;
		System.out.println("库存数量为："+COMPUTER_NUM);
	}
	
	//库存降低
	public void decrease(int num){
		COMPUTER_NUM = COMPUTER_NUM - num;
		System.out.println("库存数量为："+COMPUTER_NUM);
	}
	//获取库存数量
	public int getStockNum(){
		return this.COMPUTER_NUM;
	}
	//存货压力大了，就要通知采购人员，销售人员要尽快销售
	public void clearStock(){
		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		System.out.println("清理存货数量为： "+COMPUTER_NUM);
		//要求折价销售
		sale.offSale();   
		//要求采购人员不要采购
		purchase.refuseBuyIBM();
	}
}
