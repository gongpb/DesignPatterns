package com.principle.dip;

public class Client {
	public static void main(String[] args) {
		Driver zhangSan = new Driver();
		SangTaNa sangTaNa = new SangTaNa();
		zhangSan.drive(sangTaNa);
	}
}