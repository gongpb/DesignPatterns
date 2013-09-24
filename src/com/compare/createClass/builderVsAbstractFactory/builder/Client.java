package com.compare.createClass.builderVsAbstractFactory.builder;

public class Client {
	public static void main(String[] args) {
		Director dir = new Director();
		ICar benzA = dir.createBenzA();
		System.out.println("±¼³Û-A£º"+benzA);
		ICar bmwA = dir.createBmwA();
		System.out.println("±¦Âí-A£º"+bmwA);
	}
}
