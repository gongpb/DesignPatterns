package com.iterator.project2;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator{
	//���е���Ŀ����ArrayList ��
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	private int currentItem = 0;
	//���췽������projectList
	public ProjectIterator (ArrayList<IProject> projectList){
		this.projectList = projectList;
	}
	//�ж��Ƿ���Ԫ�أ�����ʵ��
	@Override
	public boolean hasNext() {
		boolean b = true;
		if(this.currentItem>=projectList.size()||this.projectList.get(this.currentItem)==null){
			b = false;
		}
		return b;
	}
	//ȡ��һ��ֵ
	@Override
	public Object next() {
		return (IProject)this.projectList.get(this.currentItem++);
	}

	@Override
	public void remove() {
		//��ʱû��ʹ��
	}

}
