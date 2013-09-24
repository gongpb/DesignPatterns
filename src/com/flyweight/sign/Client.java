package com.flyweight.sign;

public class Client {
	//从工厂中获得一个对象
	SignInfo signInfo = SignInfoFactory.getSignInfo();
	//进行其它的业务逻辑
}
