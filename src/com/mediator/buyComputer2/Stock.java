package com.mediator.buyComputer2;

/**
 * ������(����ͬ����)
 * @author gong_pibao
 */
public class Stock  extends AbstractColleague{
	public Stock(AbstractMediator mediator) {
		super(mediator);
	}
	//�տ�ʼ��100̨����
	private static int COMPUTER_NUM = 100;
	//�������
	public void increase(int num){
		COMPUTER_NUM = COMPUTER_NUM + num;
		System.out.println("�������Ϊ��"+COMPUTER_NUM);
	}
	
	//��潵��
	public void decrease(int num){
		COMPUTER_NUM = COMPUTER_NUM - num;
		System.out.println("�������Ϊ��"+COMPUTER_NUM);
	}
	//��ȡ�������
	public int getStockNum(){
		return this.COMPUTER_NUM;
	}
	//���ѹ�����ˣ���Ҫ֪ͨ�ɹ���Ա��������ԱҪ��������
	public void clearStock(){
		System.out.println("����������Ϊ�� "+COMPUTER_NUM);
		super.mediator.execute("stock.clear");
	}
}
