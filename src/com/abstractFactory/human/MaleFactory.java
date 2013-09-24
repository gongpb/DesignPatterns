package com.abstractFactory.human;

public class MaleFactory implements HumanFactory{
	//黑色男性
	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}
	//白色男性
	@Override
	public Human createWriteHuman() {
		return new MaleWriteHuman();
	}
	//黄色男性
	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

}
