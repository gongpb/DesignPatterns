package com.iterator.iterator;

import java.util.Iterator;

/**
 * ������ģʽ
 * 
 * ������Ҫ�Լ�д������ģʽ��һ��ʹ��java�ṩ��Iterator
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		Aggregate agg = new ConcreteAggregate();
		//�������ݵ�Ԫ�طŽ�ȥ
		agg.add("��Ŀ1");
		agg.add("��Ŀ2");
		agg.add("��Ŀ3");
		
		//����һ��
		Iterator iterator = agg.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
