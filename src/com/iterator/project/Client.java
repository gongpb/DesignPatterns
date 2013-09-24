package com.iterator.project;

import java.util.ArrayList;

public class Client {
	public static void main(String [] args) {
		ArrayList<IProject> projectList = new ArrayList<IProject>();
		projectList.add(new Project("星球大战项目",10,1000));
		projectList.add(new Project("扭转时空大战项目",100,100000));
		projectList.add(new Project("超人项目",1000,10000000));
		projectList.add(new Project("愤怒的小鸟项目",10000,100000000));
		//这边有50个项目
		for(int i =0; i< 50; i++){
			projectList.add(new Project("第   "+i+" 个项目",i*5,i*10000));
		}
		
		//遍历一下，将所有的数据取出来
		for(IProject p: projectList){
			System.out.println(p.getProjectInfo());
		}
		
	}

}
