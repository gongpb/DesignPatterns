package com.mediator.buyComputer2;

import java.util.Random;

/**
 * ���۹���(����ͬ����)
 * @author gong_pibao
 */
public class Sale extends AbstractColleague{
	public Sale(AbstractMediator mediator) {
		super(mediator);
	}
	//����IBM����
	public void sellIBMComputer(int num){
		super.mediator.execute("sale.sell", num);
		System.out.println("����IBM����Ϊ��"+num);
	}
	//����������� 0~100֮��仯��0�������û������100 ����ǳ���������һ����һ��
	public int getSaleStatus(){
		Random rand = new Random();
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM���Ե��������Ϊ��"+saleStatus);
		return saleStatus;
	}
	//�ۼ۴���
	public void offSale(){
		//�ⷿ�ж���������
		super.mediator.execute("sale.offsell");
	}
}
