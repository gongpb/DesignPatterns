package com.singleton.emperor;

public class Client {
	public static void main(String[] args) {
		//��������Ļʵ���ͬһ����
		for(int i=0; i<3; i++){
			Emperor emperor = Emperor.getInstance();
			emperor.say();
		}
	}
}
