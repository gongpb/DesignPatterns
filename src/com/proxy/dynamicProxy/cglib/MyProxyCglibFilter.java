package com.proxy.dynamicProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackFilter;

public class MyProxyCglibFilter implements CallbackFilter {

	@Override
	public int accept(Method method) {
		if(method.getName().startsWith("query")){
			return 0;
		}
		return 1;
	}

}
