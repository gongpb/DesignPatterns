package com.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class ServiceBeanFactory {
	private static ServiceBean serviceBean = new ServiceBean();

	private ServiceBeanFactory() {

	}

	// public static ServiceBean getInstance() {
	// return serviceBean;
	// }

	public static ServiceBean getProxyInstance(CglibDynamicProxy myProxy) {
		Enhancer en = new Enhancer();
		// 进行代理
		en.setSuperclass(ServiceBean.class);
		en.setCallback(myProxy);
		// 生成代理实例
		return (ServiceBean) en.create();
	}

	public static ServiceBean getAuthInstanceByFilter(CglibDynamicProxy myProxy) {
		Enhancer en = new Enhancer();
		en.setSuperclass(ServiceBean.class);
		en.setCallbacks(new Callback[] { myProxy, NoOp.INSTANCE });
		en.setCallbackFilter(new MyProxyCglibFilter());
		return (ServiceBean) en.create();
	}

}
