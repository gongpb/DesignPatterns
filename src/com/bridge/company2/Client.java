package com.bridge.company2;

/**
 * HouseCorp和ShanZhaiCorp类的区别是有参构造的参数类型上，HouseCorp类比较明确，
 * 我就是要House类，所以直接定义传进来的必须是House类，一个雷尽可能少的承担职责，
 * 而ShanZhaiCorp就不同了，它确定不了生产什么类型
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		House house = new House();
		System.out.println("--------房地产公司是这样运行的---------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		
//		System.out.println("\n--------山寨公司是这样运行的---------");
//		IPod ipod = new IPod();
//		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(ipod);
//		shanZhaiCorp.makeMoney();
		
		System.out.println("\n------突然有一天，老板发现不想生产山寨IPod了--------");
		Clothes clothes = new Clothes();
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(clothes);
		shanZhaiCorp.makeMoney();
	}
}
