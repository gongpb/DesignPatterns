package com.abstractFactory.human;

public class FemaleFactory implements HumanFactory{
	//��ɫŮ��
	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}
	//��ɫŮ��
	@Override
	public Human createWriteHuman() {
		return new FemaleWriteHuman();
	}
	//��ɫŮ��
	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

}
