package com.principle.lsp;

import java.util.HashMap;
import java.util.Map;

public class Client {
	
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		Father father = new Father();
		father.doSomething(map);
		
		Son son = new Son();
		son.doSomething(map);
	}
}