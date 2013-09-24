package com.memento.mementoExtend;
/**
 * 发起人角色
 * @author gong_pibao
 */
public class Originator implements Cloneable {
	//发起人自主恢复和备份
	private Originator backup;
	//内部状态
	private String state = "";

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//创建一个备忘录
	public void createMemento(){
		this.backup = this.clone();
	}
	//恢复一个备忘录
	public void restoreMemento(){
		this.setState(this.backup.getState());
	}
	//克隆当前对象
	@Override
	protected Originator clone() {
		Originator originator = null;
		try {
			originator = (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return originator;
	}
	
}
