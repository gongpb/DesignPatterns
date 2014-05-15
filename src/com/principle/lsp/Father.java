package com.principle.lsp;

import java.util.Collection;
import java.util.Map;

public class Father {
	public Collection doSomething(Map map) {
		System.out.println("Father.........");
		return map.values();
	}
}