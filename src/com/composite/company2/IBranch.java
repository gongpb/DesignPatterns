package com.composite.company2;

import java.util.ArrayList;

public interface IBranch extends ICorp {
	//����Ҷ�ӽڵ㡢������֦�ڵ�
	public void addSubordinate(ICorp corp);
	//����¼���Ϣ
	public ArrayList<ICorp> getSubordinateInfo();
	/**
	 * ����ҪҪ��һ��ɾ������ delSubordinateInfo(ICorp corp) 
	 * ���������������û���õ��Ͳ���д��
	 */
}
