package com.chain.women2;

public class Son extends  Handler{
	//����ֻ�Ǵ���ĸ�׵���ʾ
	public Son() {
		super(Handler.SON_LEVER_REQUEST);
	}
	//���ӵĴ�
	@Override
	protected void response(IWomen women) {
		System.out.println("------ĸ���������ʾ------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ𸴣�ͬ��\n");		
	}
	

}
