package com.composite.company;

import java.util.ArrayList;

/**
 * ���ڵ�ӿ�
 * @author gong_pibao
 */
public interface IRoot {
	//��ȡ�ܾ������Ϣ
	public String getInfo();
	//�ܾ���������С����Ҫ����С�������з����ž����������֦�ڵ�
	public void add(IBranch branch);
	//������Ҷ�ڵ�
	public void add(ILeaf leaf);
	//�ܹ����������ܾ���֪������������Щ��
	public ArrayList getSubordinateInfo();
}
