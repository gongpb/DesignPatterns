package com.compare.createClass.builderVsAbstractFactory.builder;

public class Client {
	public static void main(String[] args) {
		Director dir = new Director();
		ICar benzA = dir.createBenzA();
		System.out.println("����-A��"+benzA);
		ICar bmwA = dir.createBmwA();
		System.out.println("����-A��"+bmwA);
	}
}
