package com.mediator.buyComputer;
/**
 * 采购管理
 * @author gong_pibao
 */
public class Purchase {
	//采购IBM电脑
	public void buyIBMcomputer (int num){
		//访问库存
		Stock stock = new Stock();
		//访问销售
		Sale sale = new Sale();
		//电脑的销售情况
		int saleStatus = sale.getSaleStatus();
		
		if(saleStatus>80) //销售良好
		{
			System.out.println("采购IBM电脑   "+num+"  台");
			stock.increase(num);
		} 
		else  //销售情况不好
		{
			num = num/2;    //折半采购
			System.out.println("采购IBM电脑   "+num+"  台");
		}
	}
	//不再采用IBM电脑
	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑");
	}
}
