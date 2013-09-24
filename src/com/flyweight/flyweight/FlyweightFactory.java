package com.flyweight.flyweight;

import java.util.HashMap;

/**
 * ��Ԫ����
 * @author gong_pibao
 */
public class FlyweightFactory {
	//����һ��������
	private static HashMap<String , Flyweight> pool = new HashMap<String, Flyweight>();
	//��Ԫ����
	public static Flyweight getFlyweight(String Extrinsic){
		Flyweight flyweight = null;
		if(pool.containsKey(Extrinsic))
		{
			flyweight = pool.get(Extrinsic);
		}
		else 
		{
			//�����ⲿ״̬������Ԫ����
			flyweight = new ConcreteFlyWeight1(Extrinsic);
			//���õ�����
			pool.put(Extrinsic, flyweight);
		}
		
		return flyweight;
	}
}
