package com.mediator.buyComputer2;

/**
 * 具体中介者
 * @author gong_pibao
 */
public class Mediator extends AbstractMediator{
	//中介者最重要的方法
	@Override
	public void execute(String str, Object... objects) {
		if("purchase.buy".equals(str)) //采购电脑
		{
			this.buyIBMcomputer((Integer)objects[0]);
		} 
		else if("sale.sell".equals(str)) //销售电脑
		{
			this.sellIBMComputer((Integer)objects[0]);
		}
		else if("sale.offsell".equals(str)) //折价销售
		{
			this.offSale();
		}
		else if("stock.clear".equals(str)) //清仓处理
		{
			this.clearStock();
		}
	}
	
	//采购IBM电脑
	public void buyIBMcomputer (int num){
		int saleStatus = super.sale.getSaleStatus();
		if(saleStatus>80) //销售良好
		{
			System.out.println("采购IBM电脑   "+num+"  台");
			super.stock.increase(num);
		} 
		else  //销售情况不好
		{
			num = num/2;    //折半采购
			System.out.println("采购IBM电脑   "+num+"  台");
		}
	}
	//销售IBM电脑
	public void sellIBMComputer(int num){
		if(super.stock.getStockNum() < num) //库存数量不够销售
		{
			super.purchase.buyIBMcomputer(num);
		}
		System.out.println("销售IBM电脑为："+num);
		super.stock.decrease(num);
	}
	//折价处理
	public void offSale(){
		//库房有多少卖多少
		System.out.println("折扣销售IBM电脑      "+super.stock.getStockNum()+"  台");
	}
	//清仓处理
	public void clearStock(){
		//要求折价销售
		super.sale.offSale();   
		//要求采购人员不要采购
		super.purchase.refuseBuyIBM();
	}
}
