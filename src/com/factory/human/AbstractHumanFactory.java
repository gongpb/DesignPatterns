package com.factory.human;

public abstract class AbstractHumanFactory {
	//抽象人类创建工厂
	public abstract <T extends Human> T createHuman (Class<T> c);
}
