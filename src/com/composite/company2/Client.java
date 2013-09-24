package com.composite.company2;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Branch ceo = compositeCorTree();
		//ceo ����Ϣ
		System.out.println(ceo.getInfo());
		//Ա������Ϣ
		System.out.println(getTreeInfo(ceo));
		
	}
	//�������нڵ㣬��ӡ����Ϣ
	public static String getTreeInfo( Branch root ){
		ArrayList<ICorp> subordinateList = root.getSubordinateInfo();
		String info = "";
		for(ICorp c:subordinateList){
			if(c instanceof Leaf ){
				info = info +"\n" + c.getInfo();
			} else {
				info = info +"\n" + c.getInfo() +"\n" +getTreeInfo((Branch)c);
//				System.out.println("======"+info);
			}
		}
		return info;
	}
	
	public static Branch  compositeCorTree(){
		//����һ�����ڵ�(�ܾ���)
		Branch ceo = new Branch("������","�ܾ���",100000);
		//�������ž���
		Branch delelopDep = new Branch("�¼ұ�","�з�������",10000);
		Branch salesDep = new Branch("����","���۲�����",10000);
		Branch financeDep = new Branch("����","���񲿾���",10000);
		//���������鳤
		Branch firstDevGroup = new Branch("�з��鳤1","����һ���鳤",6000);
		Branch secDevGroup = new Branch("�з��鳤2","���������鳤",6000);
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
		ceo.addSubordinate(delelopDep);
		ceo.addSubordinate(salesDep);
		ceo.addSubordinate(financeDep);
		//�ܾ�������һ������
		ceo.addSubordinate(k);
		//�з�������
		delelopDep.addSubordinate(zhengLaoLiu);
		delelopDep.addSubordinate(firstDevGroup);
		delelopDep.addSubordinate(secDevGroup);
		//����С���鳤����
		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);
		secDevGroup.addSubordinate(d);
		secDevGroup.addSubordinate(e);
		secDevGroup.addSubordinate(f);
		secDevGroup.addSubordinate(g);
		//���۲���
		salesDep.addSubordinate(h);
		salesDep.addSubordinate(i);
		//����
		financeDep.addSubordinate(j);
		
		return ceo;
	}
}
