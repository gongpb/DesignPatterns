package com.iterator.project2;

import java.util.ArrayList;

public class Client {
	public static void main(String [] args) {
		IProject project = new Project();
		project.add("�����ս��Ŀ",10,1000);
		project.add("Ťתʱ�մ�ս��Ŀ",100,100000);
		project.add("������Ŀ",1000,10000000);
		project.add("��ŭ��С����Ŀ",10000,100000000);
		//�����50����Ŀ
		for(int i =0; i< 50; i++){
			project.add("��   "+i+" ����Ŀ",i*5,i*10000);
		}
		
		//����һ�£������е�����ȡ����
		IProjectIterator projectIterator = project.iterator();
		while(projectIterator.hasNext()){
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
		
	}

}
