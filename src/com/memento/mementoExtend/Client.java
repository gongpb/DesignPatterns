package com.memento.mementoExtend;
/**
 * 备忘录模式
 * 场景类
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//定义发起人
		Originator originator = new Originator();
		originator.setState("初始状态");
		System.out.println("初始状态是："+originator.getState());
		//建立备份
		originator.createMemento();
		//修改状态
		originator.setState("修改状态后的状态");
		System.out.println("修改状态是："+originator.getState());
		//定义备忘录管理员
		originator.restoreMemento();
		System.out.println("恢复后的状态："+originator.getState());
		
	}
}
