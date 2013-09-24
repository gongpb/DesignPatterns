package com.composite.company3;

/**
 * 树叶接口
 * @author gong_pibao
 */
public abstract class Corp {
	//公司每个人都有自己的名称
	private String name = "";
	//公司每个人都有自己的职位
	private String position = "";
	//每个人都有自己的薪水
	private int salary = 0;
	//通过构造方法传递叶子的信息
	public Corp(String name , String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//获得自己的信息
	public String getInfo(){
		String info = "";
		info = "名称：" + this.name;
		info = info +"\t 职位：" +this.position;
		info = info +"\t 薪水：" +this.salary;
		return info;
	}
}
