package com.abstractFactory.human;

public class NvWa {
	public static void main(String[] args) {
		//男性
		HumanFactory maleHumanFactory = new MaleFactory();
		//女性
		HumanFactory femaleHumanFactory = new FemaleFactory();
		//上产线建立完成，开始生产了
		//黄色
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		System.out.println("----生产第一个黄色女性----");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		System.out.println("\n----生产第一个黄色男性----");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
	}
}
