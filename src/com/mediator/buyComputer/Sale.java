package com.mediator.buyComputer;

import java.util.Random;

/**
 * ���۹���
 * @author gong_pibao
 */
public class Sale {
	//����IBM����
	public void sellIBMComputer(int num){
		//���ʿ��
		Stock stock = new Stock();
		//���ʲɹ�
		Purchase purchase = new Purchase();
		if(stock.getStockNum() < num) //���������������
		{
			purchase.buyIBMcomputer(num);
		}
		System.out.println("����IBM����Ϊ��"+num);
		stock.decrease(num);
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
		Stock stock = new Stock();
		System.out.println("�ۿ�����IBM����      "+stock.getStockNum()+"  ̨");
	}
}
