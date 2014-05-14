package com.principle.lsp;

import java.util.Collection;
import java.util.HashMap;

public class Father {
	public Collection doSomething(HashMap map) {
		System.out.println("Father.........");
		return map.values();
	}
}