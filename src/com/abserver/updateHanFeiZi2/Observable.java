package com.abserver.updateHanFeiZi2;

public interface Observable {
	//����һ���۲���
	public void addObserver(Observer observer);
	//ɾ��һ���۲���
	public void deleteObserver(Observer observer);
	//֪ͨ�۲���
	public void notiyfObservers(String context);
}