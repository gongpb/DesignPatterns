package com.factory.factory;

public abstract class Creator {
	//����һ����Ʒ����
	public abstract <T extends Product> T createProdect(Class <T> c);
}
