package com.bridge.company;

public class Client {
	public static void main(String[] args) {
		System.out.println("----------���ز���˾���������е�-------");
		HouseCorp house = new HouseCorp();
		house.makeMoney();
//		System.out.println("\n----------��װ��˾���������е�-------");
//		ClothesCorp clothes = new ClothesCorp();
//		clothes.makeMoney();
		System.out.println("\n----------ɽկIPod���������е�-------");
		IPodCorp ipod = new IPodCorp();
		ipod.makeMoney();
	}
}
