package com.iterator.project2;

import java.util.ArrayList;

public class Project implements IProject{
	//定义一个项目列表，其中有的项目放在这里
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	private String name = "";
	//项目成员数量
	private int num = 0;
	//项目费用
	private int cost = 0;
	public Project (){
		
	}
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
	//增加项目
	@Override
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project (name, num, cost));
	}
	//产生一个遍历对象
	@Override
	public IProjectIterator iterator() {
		
		return new ProjectIterator(this.projectList);
	}
	
}
