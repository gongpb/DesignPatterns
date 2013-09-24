package com.iterator.project;

import java.util.ArrayList;

public class Client {
	public static void main(String [] args) {
		ArrayList<IProject> projectList = new ArrayList<IProject>();
		projectList.add(new Project("�����ս��Ŀ",10,1000));
		projectList.add(new Project("Ťתʱ�մ�ս��Ŀ",100,100000));
		projectList.add(new Project("������Ŀ",1000,10000000));
		projectList.add(new Project("��ŭ��С����Ŀ",10000,100000000));
		//�����50����Ŀ
		for(int i =0; i< 50; i++){
			projectList.add(new Project("��   "+i+" ����Ŀ",i*5,i*10000));
		}
		
		//����һ�£������е�����ȡ����
		for(IProject p: projectList){
			System.out.println(p.getProjectInfo());
		}
		
	}

}
