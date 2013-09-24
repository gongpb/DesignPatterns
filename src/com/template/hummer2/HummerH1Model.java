package com.template.hummer2;

public class HummerH1Model extends HummerModel{
	private boolean alarmFlag = true ; //要响喇叭
	@Override
	public void alarm() {
		System.out.println("悍马H1 鸣笛");
	}
	@Override
	public void engineBoom() {
		System.out.println("悍马H1 引擎声音是这样子的........");
	}
	@Override
	public void start() {
		System.out.println("悍马H1 发动");
	}
	@Override
	public void stop() {
		System.out.println("悍马H1 停止");
	}
	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}
	
	//要不要响喇叭，是由客户决定的
	public void setAlarm(boolean isAlarm){
		 this.alarmFlag = isAlarm;
	}
	
}
