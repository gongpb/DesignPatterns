package com.abserver.updateHanFeiZi2;

public interface Observable {
	//增加一个观察者
	public void addObserver(Observer observer);
	//删除一个观察者
	public void deleteObserver(Observer observer);
	//通知观察者
	public void notiyfObservers(String context);
}