package com.iterator.iterator;

import java.util.Iterator;

public interface Aggregate {
	//是容器必然有增加的元素
	public void add(Object object);
	//减少元素
	public void remove(Object object);
	//由迭代器遍历所有的元素
	public Iterator iterator();
 		
}
