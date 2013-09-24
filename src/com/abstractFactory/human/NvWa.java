package com.abstractFactory.human;

public class NvWa {
	public static void main(String[] args) {
		//����
		HumanFactory maleHumanFactory = new MaleFactory();
		//Ů��
		HumanFactory femaleHumanFactory = new FemaleFactory();
		//�ϲ��߽�����ɣ���ʼ������
		//��ɫ
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		System.out.println("----������һ����ɫŮ��----");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		System.out.println("\n----������һ����ɫ����----");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
	}
}
