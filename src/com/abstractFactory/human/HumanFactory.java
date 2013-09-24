package com.abstractFactory.human;

public interface HumanFactory {
	//制造一个黄色人
	public Human createYellowHuman();
	//制造一个百色人
	public Human createWriteHuman();
	//制造一个黑色人
	public Human createBlackHuman();
}
