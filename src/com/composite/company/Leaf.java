package com.composite.company;

/**
 * 叶子节点的实现
 * @author gong_pibao
 */
public class Leaf implements ILeaf{
	//叶子的名称
	private String name = "";
	//叶子的职位
	private String position = "";
	//叶子的薪水
	private int salary = 0;
	//通过构造方法传递叶子的信息
	public Leaf(String name , String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//最小的小兵，只能获得自己的信息了
	@Override
	public String getInfo() {
		String info = "";
		info = "名称：" + this.name;
		info = info +"\t 职位：" +this.position;
		info = info +"\t 薪水：" +this.salary;
		return info;
	}
	

}
