package com.iterator.project2;

public interface IProject {
	//������Ŀ
	public void add(String name, int num, int cost);
	//�ϰ�Ҫ��������Ŀ��Ϣ
	public String getProjectInfo(); 
	//��ȡһ�����Ա������Ķ���
	public IProjectIterator iterator();
}
