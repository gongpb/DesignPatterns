package com.composite.company;

import java.util.ArrayList;
/**
 * 组合模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//产生一个根节点
		IRoot ceo = new Root("胡锦涛","总经理",100000);
		//三个部门经理
		IBranch delelopDep = new Branch("温家宝","研发部经理",10000);
		IBranch salesDep = new Branch("张三","销售部经理",10000);
		IBranch financeDep = new Branch("赵四","财务部经理",10000);
		//三个部门组长
		IBranch firstDevGroup = new Branch("研发组长1","开发一组组长",6000);
		IBranch secDevGroup = new Branch("研发组长2","开发二组组长",6000);
		//剩下的就是我们这些小兵了，就是路人甲、路人乙
		ILeaf a = new Leaf("a","开发人员",1000);
		ILeaf b = new Leaf("b","开发人员",1000);
		ILeaf c = new Leaf("c","开发人员",1000);
		ILeaf d = new Leaf("d","开发人员",1000);
		ILeaf e = new Leaf("e","开发人员",1000);
		ILeaf f = new Leaf("f","开发人员",1000);
		ILeaf g = new Leaf("g","开发人员",1000);
		ILeaf h = new Leaf("h","销售人员",1000);
		ILeaf i = new Leaf("i","销售人员",1000);
		ILeaf j = new Leaf("j","财务人员",1000);
		ILeaf k = new Leaf("k","CEO秘书",1000);
		
		ILeaf zhengLaoLiu = new Leaf("郑老六","研发部副总",20000);
		
		//该生产的都生产出来了，然后看看怎么组装这棵树
		//首先定义总经理下面有三个部门经理
		ceo.add(delelopDep);
		ceo.add(salesDep);
		ceo.add(financeDep);
		//总经理下有一个秘书
		ceo.add(k);
		//研发部门下面的结构
		delelopDep.add(firstDevGroup);
		delelopDep.add(secDevGroup);
		//研发部门下面还有一个副总
		secDevGroup.add(zhengLaoLiu);
		//研发部门下面的两个小组
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		secDevGroup.add(d);
		secDevGroup.add(e);
		secDevGroup.add(f);
		secDevGroup.add(g);
		
		//看看销售部门下面有哪些人员
		salesDep.add(h);
		salesDep.add(i);
		//看看财务
		salesDep.add(j);
		//打印写完的树状结构
		System.out.println(ceo.getInfo());
		//打印出来整个树形
		getAllSubordinateInfo(ceo.getSubordinateInfo());
		
	}
	//遍历所有节点，打印出信息
	public static void getAllSubordinateInfo( ArrayList subordinateList ){
		int length = subordinateList.size();
		for(int m=0; m<length; m++){
			Object obj = subordinateList.get(m);
			if(obj instanceof Leaf)  //是个叶子节点，也就是员工
			{  
				ILeaf emp = (ILeaf)obj;
				System.out.println(emp.getInfo());
			} else {
				IBranch branch = (IBranch)obj;
				System.out.println(branch.getInfo());
				//递归调用
				getAllSubordinateInfo(branch.getSubordinateInfo());
			}
		}
	}
	
}
