package com.singleton.emperor2;

public class Client {
	public static void main(String[] args) {
		//��������Ļʵ���ͬһ����
		for(int i=0; i<4; i++){
			Emperor emperor = Emperor.getInstance();
			emperor.say();
		}
	}
}
