package com.abserver.hanFeiZi;

public class HanFeiZi implements IHanFeiZi{
	//�������Ƿ��ڳԷ�����Ϊ��صı�׼
	private boolean isHaveBreakfast = false;
	//�������Ƿ�������
	private boolean isFun = false;
	//������Ҫ�Է���
	@Override
	public void haveBreakfast() {
		System.out.println("�����ӣ���ʼ�Է���----");
		this.isHaveBreakfast = true;
	}
	//�����ӿ�ʼ������
	@Override
	public void haveFun() {
		System.out.println("�����ӣ���ʼ������----");
		this.isFun = true;
	}
	
	public boolean isHaveBreakfast() {
		return isHaveBreakfast;
	}
	public void setHaveBreakfast(boolean isHaveBreakfast) {
		this.isHaveBreakfast = isHaveBreakfast;
	}
	public boolean isFun() {
		return isFun;
	}
	public void setFun(boolean isFun) {
		this.isFun = isFun;
	}

}
