package com.singleton.emperor;

public class Client {
	public static void main(String[] args) {
		//三天见到的皇帝是同一个人
		for(int i=0; i<3; i++){
			Emperor emperor = Emperor.getInstance();
			emperor.say();
		}
	}
}
