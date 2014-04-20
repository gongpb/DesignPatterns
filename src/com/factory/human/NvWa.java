package com.factory.human;

public class NvWa {
	public static void main(String [] arg){
		AbstractHumanFactory yiYangLu = new HumanFactory();
		System.out.println("-------开始造出白种人-----");
		Human writeHuman = yiYangLu.createHuman(WriteHuman.class);
		writeHuman.getColor();
		writeHuman.talk();
		System.out.println("-------开始造出黄种人------");
		Human yellowHuman = yiYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
		System.out.println("-------开始造出黑种人------");
		Human blackHuman = yiYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
	}
}