package com.mediator.buyComputer2;
/**
 * �ɹ�����(����ͬ����)
 * @author gong_pibao
 */
public class Purchase extends AbstractColleague{

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	//�ɹ�IBM����
	public void buyIBMcomputer(int num){
		super.mediator.execute("purchase.buy", num);
	}
	//���ٲɹ�IBM����
	public void refuseBuyIBM(){
		System.out.println("���ٲɹ�IBM����...");
	}
}
