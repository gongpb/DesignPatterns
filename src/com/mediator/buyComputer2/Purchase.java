package com.mediator.buyComputer2;
/**
 * 采购管理(具体同事类)
 * @author gong_pibao
 */
public class Purchase extends AbstractColleague{

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	//采购IBM电脑
	public void buyIBMcomputer(int num){
		super.mediator.execute("purchase.buy", num);
	}
	//不再采购IBM电脑
	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑...");
	}
}
