package com.abserver.abserver;

import java.util.Vector;

public abstract class Subject {
	//����һ���۲���
	private  Vector<Observer> obsVector = new Vector<Observer>();
	//����һ���۲���
	public void addObserver(Observer observer){
		this.obsVector.add(observer);
	}
	//ɾ��һ���۲���
	public void deleteObserver(Observer observer){
		this.obsVector.remove(observer);
	}
	//֪ͨ���еĹ۲���
	public void notifyObservers(String context){
		for(Observer observer:obsVector){
			observer.update(context);
		}
	}
	public abstract void doSomething();
}
