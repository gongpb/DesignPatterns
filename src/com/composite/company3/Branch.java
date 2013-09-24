package com.composite.company3;

import java.util.ArrayList;
/**
 * 分支的节点实现
 * @author gong_pibao
 */
public class Branch extends Corp {
	
	//存储子节点的信息(领导下面还有下级领导和小兵)
	private ArrayList<Corp> subordinateList = new ArrayList<Corp>();
	
	//这个构造方法是必须的
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}
	//增加一个下属，可能是下级领导、也可能是小兵
	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}
	//获得下级的信息
	public ArrayList<Corp> getSubordinateInfo() {
		return this.subordinateList;
	}
}
