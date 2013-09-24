package com.mediator.buyComputer2;

/**
 * �����н���
 * @author gong_pibao
 */
public class Mediator extends AbstractMediator{
	//�н�������Ҫ�ķ���
	@Override
	public void execute(String str, Object... objects) {
		if("purchase.buy".equals(str)) //�ɹ�����
		{
			this.buyIBMcomputer((Integer)objects[0]);
		} 
		else if("sale.sell".equals(str)) //���۵���
		{
			this.sellIBMComputer((Integer)objects[0]);
		}
		else if("sale.offsell".equals(str)) //�ۼ�����
		{
			this.offSale();
		}
		else if("stock.clear".equals(str)) //��ִ���
		{
			this.clearStock();
		}
	}
	
	//�ɹ�IBM����
	public void buyIBMcomputer (int num){
		int saleStatus = super.sale.getSaleStatus();
		if(saleStatus>80) //��������
		{
			System.out.println("�ɹ�IBM����   "+num+"  ̨");
			super.stock.increase(num);
		} 
		else  //�����������
		{
			num = num/2;    //�۰�ɹ�
			System.out.println("�ɹ�IBM����   "+num+"  ̨");
		}
	}
	//����IBM����
	public void sellIBMComputer(int num){
		if(super.stock.getStockNum() < num) //���������������
		{
			super.purchase.buyIBMcomputer(num);
		}
		System.out.println("����IBM����Ϊ��"+num);
		super.stock.decrease(num);
	}
	//�ۼ۴���
	public void offSale(){
		//�ⷿ�ж���������
		System.out.println("�ۿ�����IBM����      "+super.stock.getStockNum()+"  ̨");
	}
	//��ִ���
	public void clearStock(){
		//Ҫ���ۼ�����
		super.sale.offSale();   
		//Ҫ��ɹ���Ա��Ҫ�ɹ�
		super.purchase.refuseBuyIBM();
	}
}
