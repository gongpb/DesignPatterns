package com.chain.women;

public class Son implements IHandler{
	//ĸ���������ʾ
	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("ĸ�׵���ʾ�ǣ�"+women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ�⣡");
	}

}
