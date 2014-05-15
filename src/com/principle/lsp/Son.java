package com.principle.lsp;

import java.util.Collection;
import java.util.HashMap;

public class Son extends Father{
	
//	@Override
	public Collection doSomething(HashMap map) {
		System.out.println("Son........");
		return map.values();
	}
}