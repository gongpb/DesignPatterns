package com.composite.company2;

import java.util.ArrayList;
/**
 * 分支的节点实现
 * @author gong_pibao
 */
public class Branch implements IBranch{
	//存储子节点的信息(领导下面还有下级领导和小兵)
	private ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
	//树枝节点的名称
	private String name = "";
	//树枝节点的职位
	private String position = "";
	//树枝节点的薪水
	private int salary = 0;
	//通过构造方法传递树枝节点的信息
	public Branch(String name , String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	//增加一个下属，可能是下级领导、也可能是小兵
	@Override
	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}
	
	//获取自己树枝节点的信息
	@Override
	public String getInfo() {
		String info = "";
		info = "名称：" + this.name;
		info = info +"\t 职位：" +this.position;
		info = info +"\t 薪水：" +this.salary;
		return info;
	}
	//获得下级的信息
	@Override
	public ArrayList<ICorp> getSubordinateInfo() {
		return this.subordinateList;
	}
}
