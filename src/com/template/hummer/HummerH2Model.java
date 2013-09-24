package com.template.hummer;

public class HummerH2Model extends HummerModel{

	@Override
	public void alarm() {
		System.out.println("悍马H2 鸣笛");
		
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H2 引擎声音是这样子的........");
		
	}

	@Override
	public void start() {
		System.out.println("悍马H2 发动");
		
	}

	@Override
	public void stop() {
		System.out.println("悍马H2 停止");
		
	}
}
