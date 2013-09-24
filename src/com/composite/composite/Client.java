package com.composite.composite;

public class Client {
	public static void main(String[] args) {
		//创建一个根节点
		Composite root = new Composite();
		root.doSomething();
		//创建一个树枝
		Composite branch = new Composite();
		//创建一个子叶节点
		Leaf leaf = new Leaf();
		//建立整体
		root.add(branch);
		branch.add(leaf);
		
	}
	
	//通过递归遍历树
	public static void display(Composite root){
		for(Component c:root.getChildren())
		{
			if(c instanceof Leaf) //子叶节点
			{
				c.doSomething();
			}
			else //树枝节点
			{
				display((Composite)c);
			}
		}
	}
}
