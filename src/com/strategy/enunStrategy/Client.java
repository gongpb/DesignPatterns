package com.strategy.enunStrategy;

import java.util.Arrays;

public class Client {
	public static void main(String[] args) {
		//�������������������
		int a = Integer.parseInt("1");
		int b = Integer.parseInt("2");
//		System.out.println("����Ĳ���Ϊ��"+Arrays.toString(args));
		System.out.println("���н��Ϊ��"+a+ "+" +b+"="+Calculator.ADD.exec(a, b));
	}
}
