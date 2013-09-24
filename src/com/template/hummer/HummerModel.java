package com.template.hummer;
/**
 * 抽象悍马模型
 * @author gong_pibao
 */
public abstract class HummerModel {
	//模型启动
	public abstract void start();
	//停止
	public abstract void stop();
	//喇叭发出声音
	public abstract void alarm();
	//引擎发出隆隆的响声
	public abstract void engineBoom();
	//跑起来
	public  void run(){
		//先发动汽车
		this.start();
		//引擎开始轰鸣
		this.engineBoom();
		//按喇叭
		this.alarm();
		//到达目的地就停止
		this.stop();
	}
}
