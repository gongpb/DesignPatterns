package com.chain.women2;

public class Father extends Handler{
	//����ֻ�Ǵ���Ů������ʾ
	public Father() {
		super(Handler.FATHER_LEVER_REQUEST);
	}
	//���׵Ĵ�
	@Override
	protected void response(IWomen women) {
		System.out.println("------Ů��������ʾ------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ𸴣�ͬ��\n");
	}
	
}
