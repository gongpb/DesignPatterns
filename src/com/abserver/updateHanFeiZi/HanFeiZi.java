package com.abserver.updateHanFeiZi;

/**
 * ͨ���ۼ���ʽ�ı��۲���
 * @author gong_pibao
 */
public class HanFeiZi implements IHanFeiZi{
	private ILiSi liSi = new LiSi();
	//������Ҫ�Է���
	@Override
	public void haveBreakfast() {
		System.out.println("�����ӣ���ʼ�Է���----");
		this.liSi.update("�������ڳԷ���");
	}
	//�����ӿ�ʼ������
	@Override
	public void haveFun() {
		System.out.println("�����ӣ���ʼ������----");
		this.liSi.update("�����ӿ�ʼ������");
	}
}
