package com.abserver.updateHanFeiZi2;

import java.util.ArrayList;

public class HanFeiZi implements Observable , IHanFeiZi{
	private ArrayList<Observer> obseverList = new ArrayList<Observer>();
	
	//������Ҫ�Է���
	@Override
	public void haveBreakfast() {
		System.out.println("�����ӣ���ʼ�Է���----");
		//֪ͨ���еĹ۲���
		this.notiyfObservers("�����ӿ�ʼ�Է���");
	}
	//�����ӿ�ʼ������
	@Override
	public void haveFun() {
		System.out.println("�����ӣ���ʼ������----");
		//֪ͨ���еĹ�����
		this.notiyfObservers("�����ӿ�ʼ������ ");
	}
	
	
	//���ӹ۲���
	@Override
	public void addObserver(Observer observer) {
		this.obseverList.add(observer);
	}
	//ɾ���۲���
	@Override
	public void deleteObserver(Observer observer) {
		this.obseverList.remove(observer);
	}
	//֪ͨ���й۲���
	@Override
	public void notiyfObservers(String context) {
		for(Observer observer:obseverList){
			observer.update(context);
		}
	}

}
