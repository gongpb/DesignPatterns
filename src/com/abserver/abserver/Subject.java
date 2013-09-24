package com.abserver.abserver;

import java.util.Vector;

public abstract class Subject {
	//定义一个观察者
	private  Vector<Observer> obsVector = new Vector<Observer>();
	//增加一个观察者
	public void addObserver(Observer observer){
		this.obsVector.add(observer);
	}
	//删除一个观察者
	public void deleteObserver(Observer observer){
		this.obsVector.remove(observer);
	}
	//通知所有的观察者
	public void notifyObservers(String context){
		for(Observer observer:obsVector){
			observer.update(context);
		}
	}
	public abstract void doSomething();
}
