package com.abserver.updateHanFeiZi3;

import java.util.ArrayList;
import java.util.Observable;

/**
 * �� java.util.Observable ��ʵ��
 * ���۲����� HanFeiZi ֻҪרע�Լ���ҵ���߼��Ϳ�����
 * @author gong_pibao
 */
public class XiJinPing extends Observable implements  IXiJinPing{
	//������Ҫ�Է���
	@Override
	public void haveBreakfast() {
		System.out.println("�����ӣ���ʼ�Է���----");
		//֪ͨ���еĹ۲���
		super.setChanged();
		super.notifyObservers("���������ڳԷ�");
	}
	//�����ӿ�ʼ������
	@Override
	public void haveFun() {
		System.out.println("�����ӣ���ʼ������----");
		//֪ͨ���еĹ�����
		super.setChanged();
		this.notifyObservers("��������������");
	}

}