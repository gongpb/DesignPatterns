package com.chain.women;

public class Father implements IHandler{
	//δ���޵�Ů����ʾ����
	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("Ů������ʾ�ǣ�"+women.getRequest());
		System.out.println("���׵Ĵ��ǣ�ͬ�⣡");
	}
}
