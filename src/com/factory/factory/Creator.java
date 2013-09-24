package com.factory.factory;

public abstract class Creator {
	//创建一个产品对象
	public abstract <T extends Product> T createProdect(Class <T> c);
}
