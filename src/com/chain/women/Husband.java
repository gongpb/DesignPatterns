package com.chain.women;

public class Husband implements IHandler{
	//�������ɷ���ʾ
	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("���ӵ���ʾ�ǣ�"+women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ�⣡");
	}

}
