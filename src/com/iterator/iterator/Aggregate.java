package com.iterator.iterator;

import java.util.Iterator;

public interface Aggregate {
	//��������Ȼ�����ӵ�Ԫ��
	public void add(Object object);
	//����Ԫ��
	public void remove(Object object);
	//�ɵ������������е�Ԫ��
	public Iterator iterator();
 		
}
