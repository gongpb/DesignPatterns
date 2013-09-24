package com.composite.company3;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Branch ceo = compositeCorTree();
		//ceo 的信息
		System.out.println(ceo.getInfo());
		//员工的信息
		System.out.println(getTreeInfo(ceo));
		
	}
	//遍历所有节点，打印出信息
	public static String getTreeInfo( Branch root ){
		ArrayList<Corp> subordinateList = root.getSubordinateInfo();
		String info = "";
		for(Corp c:subordinateList){
			if(c instanceof Leaf ) //子叶
			{
				info = info +"\n" + c.getInfo();
			} 
			else  //树枝节点
			{
				info = info +"\n" + c.getInfo() +"\n" +getTreeInfo((Branch)c);
			}
		}
		return info;
	}
	
	public static Branch  compositeCorTree(){
		//产生一个根节点(总经理)
		Branch ceo = new Branch("胡锦涛","总经理",100000);
		//三个部门经理
		Branch delelopDep = new Branch("温家宝","研发部经理",10000);
		Branch salesDep = new Branch("张三","销售部经理",10000);
		Branch financeDep = new Branch("赵四","财务部经理",10000);
		//三个部门组长
		Branch firstDevGroup = new Branch("研发组长1","开发一组组长",6000);
		Branch secDevGroup = new Branch("研发组长2","开发二组组长",6000);
		//剩下的就是我们这些小兵了，就是路人甲、路人乙
		Leaf a = new Leaf("a","开发人员",1000);
		Leaf b = new Leaf("b","开发人员",1000);
		Leaf c = new Leaf("c","开发人员",1000);
		Leaf d = new Leaf("d","开发人员",1000);
		Leaf e = new Leaf("e","开发人员",1000);
		Leaf f = new Leaf("f","开发人员",1000);
		Leaf g = new Leaf("g","开发人员",1000);
		Leaf h = new Leaf("h","销售人员",1000);
		Leaf i = new Leaf("i","销售人员",1000);
		Leaf j = new Leaf("j","财务人员",1000);
		Leaf k = new Leaf("k","CEO秘书",1000);
		
		Leaf zhengLaoLiu = new Leaf("郑老六","研发部副总",20000);
		
		//该生产的都生产出来了，然后看看怎么组装这棵树
		//首先定义总经理下面有三个部门经理
		ceo.addSubordinate(delelopDep);
		ceo.addSubordinate(salesDep);
		ceo.addSubordinate(financeDep);
		//总经理下有一个秘书
		ceo.addSubordinate(k);
		//研发部经理
		delelopDep.addSubordinate(zhengLaoLiu);
		delelopDep.addSubordinate(firstDevGroup);
		delelopDep.addSubordinate(secDevGroup);
		//两个小组组长下面
		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);
		secDevGroup.addSubordinate(d);
		secDevGroup.addSubordinate(e);
		secDevGroup.addSubordinate(f);
		secDevGroup.addSubordinate(g);
		//销售部门
		salesDep.addSubordinate(h);
		salesDep.addSubordinate(i);
		//财务部
		financeDep.addSubordinate(j);
		
		return ceo;
	}
}
