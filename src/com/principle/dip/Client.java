package com.principle.dip;

public class Client {
	public static void main(String[] args) {
		Driver zhangSan = new Driver();
		Benz benz = new Benz();
		zhangSan.drive(benz);
	}
}