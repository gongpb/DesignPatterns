package com.bridge.company;

public class Client {
	public static void main(String[] args) {
		System.out.println("----------房地产公司是这样运行的-------");
		HouseCorp house = new HouseCorp();
		house.makeMoney();
//		System.out.println("\n----------服装公司是这样运行的-------");
//		ClothesCorp clothes = new ClothesCorp();
//		clothes.makeMoney();
		System.out.println("\n----------山寨IPod是这样运行的-------");
		IPodCorp ipod = new IPodCorp();
		ipod.makeMoney();
	}
}
