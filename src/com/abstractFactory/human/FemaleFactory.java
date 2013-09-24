package com.abstractFactory.human;

public class FemaleFactory implements HumanFactory{
	//黑色女性
	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}
	//白色女性
	@Override
	public Human createWriteHuman() {
		return new FemaleWriteHuman();
	}
	//黄色女性
	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

}
