package com.builder.carModel;

import java.util.ArrayList;

public abstract class CarModel {
	//这个参数是各个方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<String>();
	//模型启动就开始跑了
	protected abstract void start();
	//停止
	protected abstract void stop();
	//喇叭发出声音
	protected abstract void alarm();
	//引擎发出隆隆的响声
	protected abstract void engineBoom();
	
	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
	//模型会跑
	final public void run(){
		//执行一遍，谁在前，就先执行谁
		for(int i=0; i<this.sequence.size(); i++){
			String actionName = sequence.get(i);
			if(actionName.equalsIgnoreCase("start"))
			{
				this.start();
			}
			else  if(actionName.equalsIgnoreCase("stop"))
			{
				this.stop();
			}
			else if(actionName.equalsIgnoreCase("alarm"))
			{
				this.alarm();
			}
			else if(actionName.equalsIgnoreCase("engineBoom"))
			{
				this.engineBoom();
			}
		}
	}
}
