package com.bridge.company2;

/**
 * HouseCorp��ShanZhaiCorp����������вι���Ĳ��������ϣ�HouseCorp��Ƚ���ȷ��
 * �Ҿ���ҪHouse�࣬����ֱ�Ӷ��崫�����ı�����House�࣬һ���׾������ٵĳе�ְ��
 * ��ShanZhaiCorp�Ͳ�ͬ�ˣ���ȷ����������ʲô����
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		House house = new House();
		System.out.println("--------���ز���˾���������е�---------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		
//		System.out.println("\n--------ɽկ��˾���������е�---------");
//		IPod ipod = new IPod();
//		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(ipod);
//		shanZhaiCorp.makeMoney();
		
		System.out.println("\n------ͻȻ��һ�죬�ϰ巢�ֲ�������ɽկIPod��--------");
		Clothes clothes = new Clothes();
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(clothes);
		shanZhaiCorp.makeMoney();
	}
}
