package com.mediator.buyComputer;
/**
 * �ɹ�����
 * @author gong_pibao
 */
public class Purchase {
	//�ɹ�IBM����
	public void buyIBMcomputer (int num){
		//���ʿ��
		Stock stock = new Stock();
		//��������
		Sale sale = new Sale();
		//���Ե��������
		int saleStatus = sale.getSaleStatus();
		
		if(saleStatus>80) //��������
		{
			System.out.println("�ɹ�IBM����   "+num+"  ̨");
			stock.increase(num);
		} 
		else  //�����������
		{
			num = num/2;    //�۰�ɹ�
			System.out.println("�ɹ�IBM����   "+num+"  ̨");
		}
	}
	//���ٲ���IBM����
	public void refuseBuyIBM(){
		System.out.println("���ٲɹ�IBM����");
	}
}
