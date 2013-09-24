package com.memento.mementoExtendNoUpdate;
/**
 * 发起人角色
 * @author gong_pibao
 */
public class Originator {
	//内部状态
	private String state = "";

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//创建一个备忘录
	public Memento createMemento(){
		return new Memento(this.state);
	}
	//恢复一个备忘录
	public void restoreMemento(IMemento memento){
		this.setState(((Memento) memento).getState());
	}
	/**
	 * 内部类
	 * 内部类全都是private访问权限，也就是说出来发起人，别人休想访问单，那如果要产生关联关系要如何处理呢？
	 * 通过接口！饿哦们还有一个空接口是公共访问权限
	 */
	private class Memento implements IMemento{
		//发起人的内部状态
		private String state = "";
		//通过构造方法传递状态
		public Memento(String state){
			this.state = state ;
		}
		private String getState() {
			return state;
		}
		private void setState(String state) {
			this.state = state;
		}
	}
	
}
