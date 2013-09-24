package com.iterator.project2;

import java.util.ArrayList;

public class Client {
	public static void main(String [] args) {
		IProject project = new Project();
		project.add("星球大战项目",10,1000);
		project.add("扭转时空大战项目",100,100000);
		project.add("超人项目",1000,10000000);
		project.add("愤怒的小鸟项目",10000,100000000);
		//这边有50个项目
		for(int i =0; i< 50; i++){
			project.add("第   "+i+" 个项目",i*5,i*10000);
		}
		
		//遍历一下，将所有的数据取出来
		IProjectIterator projectIterator = project.iterator();
		while(projectIterator.hasNext()){
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
		
	}

}
