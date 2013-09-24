package com.composite.company;

import java.util.ArrayList;
/**
 * 根节点的实现
 * @author gong_pibao
 */
public class Root implements IRoot{
	//保存根节点下的树枝节点、树叶节点  ,Subordinate的意思是下级
	private ArrayList subordinateList = new ArrayList();
	//根节点的名称
	private String name = "";
	//根节点的职位
	private String position = "";
	//根节点的薪水
	private  int salary = 0;
	//通过构造方法传递总经理的信息
	public Root(String name , String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//增加树枝节点
	@Override
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}
	
	//增加子节点，比如秘书，直接隶属于总经理
	@Override
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}
	//获得自己的信息
	@Override
	public String getInfo() {
		String info = "";
		info = "名称：" + this.name;
		info = info +"职位："  +this.position;
		info = info +"薪水："  +this.salary;
		return info;
	}
	//得到下级的信息
	@Override
	public ArrayList getSubordinateInfo() {
		return this.subordinateList;
	}

}
