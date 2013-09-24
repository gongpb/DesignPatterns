package com.iterator.iterator;

import java.util.Iterator;

/**
 * 迭代器模式
 * 
 * 尽量不要自己写迭代器模式，一般使用java提供的Iterator
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		Aggregate agg = new ConcreteAggregate();
		//产生数据的元素放进去
		agg.add("项目1");
		agg.add("项目2");
		agg.add("项目3");
		
		//遍历一下
		Iterator iterator = agg.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
