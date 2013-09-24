package com.iterator.iterator;

import java.util.Iterator;
import java.util.Vector;
/**
 * ��������
 * @author gong_pibao
 */
public class ConcreteAggregate implements Aggregate{
	//���ɶ��������
	public Vector vector = new Vector();
	//����һ��Ԫ��
	@Override
	public void add(Object object) {
		this.vector.add(object);
	}
	//���ص���������
	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this.vector);
	}
	//ɾ��һ��Ԫ��
	@Override
	public void remove(Object object) {
		this.remove(object);
	}

}
