package com.factory.human;

public abstract class AbstractHumanFactory {
	//�������ഴ������
	public abstract <T extends Human> T createHuman (Class<T> c);
}
