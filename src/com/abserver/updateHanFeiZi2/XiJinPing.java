package com.abserver.updateHanFeiZi2;

import java.util.ArrayList;

public class XiJinPing implements Observable , IXiJinPing{
	private ArrayList<Observer> obseverList = new ArrayList<Observer>();
	
	//韩非子要吃饭了
	@Override
	public void haveBreakfast() {
		System.out.println("习主席：开始吃饭了----");
		//通知所有的观察者
		this.notiyfObservers("习主席开始吃饭了");
	}
	//韩非子开始娱乐了
	@Override
	public void haveFun() {
		System.out.println("习主席：开始娱乐了----");
		//通知所有的管着着
		this.notiyfObservers("习主席开始娱乐了 ");
	}
	
	
	//增加观察者
	@Override
	public void addObserver(Observer observer) {
		this.obseverList.add(observer);
	}
	//删除观察者
	@Override
	public void deleteObserver(Observer observer) {
		this.obseverList.remove(observer);
	}
	//通知所有观察者
	@Override
	public void notiyfObservers(String context) {
		for(Observer observer:obseverList){
			observer.update(context);
		}
	}

}
