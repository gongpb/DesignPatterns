package com.chain.women2;

public class Husband extends  Handler{
	//�ɷ�ֻ�Ǵ������ӵ���ʾ
	public Husband() {
		super(Handler.HUSBAND_LEVER_REQUEST);
	}
	//�ɷ�Ĵ�
	@Override
	protected void response(IWomen women) {
		System.out.println("------�������ɷ���ʾ------");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ𸴣�ͬ��\n");
	}


}
