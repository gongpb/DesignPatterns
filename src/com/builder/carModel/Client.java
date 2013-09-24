package com.builder.carModel;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		///////////////////////////////////////////////////
		//存放run的顺序
//		ArrayList<String> sequence = new ArrayList<String>();
//		sequence.add("engineBoom"); //客户要求跑去来的时候要先发动引擎
//		sequence.add("start"); // 启动
//		sequence.add("stop");  //停止
//		//---------------制造奔驰车-----------
//		//制造一个奔驰车
//		BenzBuilder benzBuilder = new BenzBuilder();
//		//把组装顺序给builder类，制造出一个车来
//		benzBuilder.setSequence(sequence);
//		//制造出一个奔驰车
//		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//		//奔驰车跑一下看看
//		benz.run();
//		System.out.println("\n");
//		//---------------制造宝马车-----------
//		BMWBuilder bmwBuilder = new BMWBuilder();
//		bmwBuilder.setSequence(sequence);
//		BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
//		bmw.run();
		
		/////////////////////////////////////////////
		Director director =  new Director();
		//生产10辆A型奔驰
		for(int i=0; i<10; i++){
			//A型奔驰车跑起来
			director.getABenzModel().run();
		}
	}
}
