package com.iterator.iterator;

import java.util.Iterator;
import java.util.Vector;
/**
 *具体迭代器 
 * @author gong_pibao
 */
public class ConcreteIterator implements Iterator{
	//所有的项目法放在vector 中
	private Vector vector = new Vector();
	//定义当前游标
	private int cursor = 0;
	public ConcreteIterator(Vector vector){
		this.vector = vector;
	}
	//判断是否有下一个元素
	@Override
	public boolean hasNext() {
		if(this.cursor == this.vector.size())
		{
			return false;
		} else {
			return true;
		}
	}
	//返回下一个元素
	@Override
	public Object next() {
		Object result = null;
		if(this.hasNext()){
			result = this.vector.get(this.cursor++);
		} else {
			return null;
		}
		return result;
	}
	
	//删除当前元素
	@Override
	public void remove() {
		this.vector.remove(this.cursor);
	}
	
}
