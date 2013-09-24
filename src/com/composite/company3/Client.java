package com.composite.company3;

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
		ArrayList<Corp> subordinateList = root.getSubordinateInfo();
		String info = "";
		for(Corp c:subordinateList){
			if(c instanceof Leaf ) //��Ҷ
			{
				info = info +"\n" + c.getInfo();
			} 
			else  //��֦�ڵ�
			{
				info = info +"\n" + c.getInfo() +"\n" +getTreeInfo((Branch)c);
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
		Leaf a = new Leaf("a","������Ա",1000);
		Leaf b = new Leaf("b","������Ա",1000);
		Leaf c = new Leaf("c","������Ա",1000);
		Leaf d = new Leaf("d","������Ա",1000);
		Leaf e = new Leaf("e","������Ա",1000);
		Leaf f = new Leaf("f","������Ա",1000);
		Leaf g = new Leaf("g","������Ա",1000);
		Leaf h = new Leaf("h","������Ա",1000);
		Leaf i = new Leaf("i","������Ա",1000);
		Leaf j = new Leaf("j","������Ա",1000);
		Leaf k = new Leaf("k","CEO����",1000);
		
		Leaf zhengLaoLiu = new Leaf("֣����","�з�������",20000);
		
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
