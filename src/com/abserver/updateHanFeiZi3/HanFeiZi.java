package com.abserver.updateHanFeiZi3;

import java.util.ArrayList;
import java.util.Observable;

/**
 * �� java����Ʒ������java.util.Observable ��ʵ��
 * ���۲����� HanFeiZi ֻҪרע�Լ���ҵ���߼��Ϳ�����
 * @author gong_pibao
 */
public class HanFeiZi extends Observable implements  IHanFeiZi{
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
