package com.template.hummer;

public class HummerH1Model extends HummerModel{

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
}
