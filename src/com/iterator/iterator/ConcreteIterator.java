package com.iterator.iterator;

import java.util.Iterator;
import java.util.Vector;
/**
 *��������� 
 * @author gong_pibao
 */
public class ConcreteIterator implements Iterator{
	//���е���Ŀ������vector ��
	private Vector vector = new Vector();
	//���嵱ǰ�α�
	private int cursor = 0;
	public ConcreteIterator(Vector vector){
		this.vector = vector;
	}
	//�ж��Ƿ�����һ��Ԫ��
	@Override
	public boolean hasNext() {
		if(this.cursor == this.vector.size())
		{
			return false;
		} else {
			return true;
		}
	}
	//������һ��Ԫ��
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
	
	//ɾ����ǰԪ��
	@Override
	public void remove() {
		this.vector.remove(this.cursor);
	}
	
}
