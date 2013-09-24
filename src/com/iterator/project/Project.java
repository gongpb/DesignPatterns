package com.iterator.project;

public class Project implements IProject{
	private String name = "";
	//项目成员数量
	private int num = 0;
	//项目费用
	private int cost = 0;
	//定义一个构造方法，将所有老板想看的的信息存储起来
	public Project (String name, int num, int cost){
		//赋值到类里面的成员变量中
		this.name = name;
		this.num  = num;
		this.cost = cost;
	}
	//获取项目信息
	@Override
	public String getProjectInfo() {
		String info = "";
		//获取项目的名称
		info = info +"  项目的名称是： "+ this.name;
		info = info +"\t项目人数： " + this.num;
		info = info +"\t项目费用： " + this.cost;
		return info;
	}
	
}
