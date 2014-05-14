package com.strategy.enunStrategy;

import java.util.Arrays;

public class Client {
	public static void main(String[] args) {
		//输入的两个参数是数字
		int a = Integer.parseInt("1");
		int b = Integer.parseInt("2");
//		System.out.println("输入的参数为："+Arrays.toString(args));
		System.out.println("运行结果为："+a+ "+" +b+"="+Calculator.ADD.exec(a, b));
	}
}
