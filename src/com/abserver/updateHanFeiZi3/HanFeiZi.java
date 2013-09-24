package com.abserver.updateHanFeiZi3;

import java.util.ArrayList;
import java.util.Observable;

/**
 * 用 java正九品美国的java.util.Observable 类实现
 * 被观察者类 HanFeiZi 只要专注自己的业务逻辑就可以了
 * @author gong_pibao
 */
public class HanFeiZi extends Observable implements  IHanFeiZi{
	//韩非子要吃饭了
	@Override
	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了----");
		//通知所有的观察者
		super.setChanged();
		super.notifyObservers("韩非子正在吃饭");
	}
	//韩非子开始娱乐了
	@Override
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了----");
		//通知所有的管着着
		super.setChanged();
		this.notifyObservers("韩非子正在娱乐");
	}

}
