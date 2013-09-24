package com.composite.company3;

import java.util.ArrayList;
/**
 * ��֧�Ľڵ�ʵ��
 * @author gong_pibao
 */
public class Branch extends Corp {
	
	//�洢�ӽڵ����Ϣ(�쵼���滹���¼��쵼��С��)
	private ArrayList<Corp> subordinateList = new ArrayList<Corp>();
	
	//������췽���Ǳ����
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}
	//����һ���������������¼��쵼��Ҳ������С��
	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}
	//����¼�����Ϣ
	public ArrayList<Corp> getSubordinateInfo() {
		return this.subordinateList;
	}
}
