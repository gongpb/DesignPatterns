package com.abstractFactory.human;

public class MaleFactory implements HumanFactory{
	//��ɫ����
	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}
	//��ɫ����
	@Override
	public Human createWriteHuman() {
		return new MaleWriteHuman();
	}
	//��ɫ����
	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

}
