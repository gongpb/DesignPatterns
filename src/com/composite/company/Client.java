package com.composite.company;

import java.util.ArrayList;
/**
 * ���ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//����һ�����ڵ�
		IRoot ceo = new Root("������","�ܾ���",100000);
		//�������ž���
		IBranch delelopDep = new Branch("�¼ұ�","�з�������",10000);
		IBranch salesDep = new Branch("����","���۲�����",10000);
		IBranch financeDep = new Branch("����","���񲿾���",10000);
		//���������鳤
		IBranch firstDevGroup = new Branch("�з��鳤1","����һ���鳤",6000);
		IBranch secDevGroup = new Branch("�з��鳤2","���������鳤",6000);
		//ʣ�µľ���������ЩС���ˣ�����·�˼ס�·����
		ILeaf a = new Leaf("a","������Ա",1000);
		ILeaf b = new Leaf("b","������Ա",1000);
		ILeaf c = new Leaf("c","������Ա",1000);
		ILeaf d = new Leaf("d","������Ա",1000);
		ILeaf e = new Leaf("e","������Ա",1000);
		ILeaf f = new Leaf("f","������Ա",1000);
		ILeaf g = new Leaf("g","������Ա",1000);
		ILeaf h = new Leaf("h","������Ա",1000);
		ILeaf i = new Leaf("i","������Ա",1000);
		ILeaf j = new Leaf("j","������Ա",1000);
		ILeaf k = new Leaf("k","CEO����",1000);
		
		ILeaf zhengLaoLiu = new Leaf("֣����","�з�������",20000);
		
		//�������Ķ����������ˣ�Ȼ�󿴿���ô��װ�����
		//���ȶ����ܾ����������������ž���
		ceo.add(delelopDep);
		ceo.add(salesDep);
		ceo.add(financeDep);
		//�ܾ�������һ������
		ceo.add(k);
		//�з���������Ľṹ
		delelopDep.add(firstDevGroup);
		delelopDep.add(secDevGroup);
		//�з��������滹��һ������
		secDevGroup.add(zhengLaoLiu);
		//�з��������������С��
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		secDevGroup.add(d);
		secDevGroup.add(e);
		secDevGroup.add(f);
		secDevGroup.add(g);
		
		//�������۲�����������Щ��Ա
		salesDep.add(h);
		salesDep.add(i);
		//��������
		salesDep.add(j);
		//��ӡд�����״�ṹ
		System.out.println(ceo.getInfo());
		//��ӡ������������
		getAllSubordinateInfo(ceo.getSubordinateInfo());
		
	}
	//�������нڵ㣬��ӡ����Ϣ
	public static void getAllSubordinateInfo( ArrayList subordinateList ){
		int length = subordinateList.size();
		for(int m=0; m<length; m++){
			Object obj = subordinateList.get(m);
			if(obj instanceof Leaf)  //�Ǹ�Ҷ�ӽڵ㣬Ҳ����Ա��
			{  
				ILeaf emp = (ILeaf)obj;
				System.out.println(emp.getInfo());
			} else {
				IBranch branch = (IBranch)obj;
				System.out.println(branch.getInfo());
				//�ݹ����
				getAllSubordinateInfo(branch.getSubordinateInfo());
			}
		}
	}
	
}
