package com.iterator.project2;

public interface IProject {
	//增加项目
	public void add(String name, int num, int cost);
	//老板要看的是项目信息
	public String getProjectInfo(); 
	//获取一个可以被遍历的对象
	public IProjectIterator iterator();
}
