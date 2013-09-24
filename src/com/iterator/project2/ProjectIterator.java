package com.iterator.project2;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator{
	//所有的项目放在ArrayList 中
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	private int currentItem = 0;
	//构造方法传入projectList
	public ProjectIterator (ArrayList<IProject> projectList){
		this.projectList = projectList;
	}
	//判断是否还有元素，必须实现
	@Override
	public boolean hasNext() {
		boolean b = true;
		if(this.currentItem>=projectList.size()||this.projectList.get(this.currentItem)==null){
			b = false;
		}
		return b;
	}
	//取下一个值
	@Override
	public Object next() {
		return (IProject)this.projectList.get(this.currentItem++);
	}

	@Override
	public void remove() {
		//暂时没有使用
	}

}
