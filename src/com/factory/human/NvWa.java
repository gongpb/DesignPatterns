package com.factory.human;

public class NvWa {
	public static void main(String [] arg){
		AbstractHumanFactory yiYangLu = new HumanFactory();
		System.out.println("-------��ʼ���������-----");
		Human writeHuman = yiYangLu.createHuman(WriteHuman.class);
		writeHuman.getColor();
		writeHuman.talk();
		System.out.println("-------��ʼ���������------");
		Human yellowHuman = yiYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
		System.out.println("-------��ʼ���������------");
		Human blackHuman = yiYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
	}
}