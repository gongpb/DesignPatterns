package com.proxy.dynamicProxy.cglib;
/**
 * http://blog.csdn.net/xiaohai0504/article/details/6832990
 * @author gongpeibao
 *
 */
public class Client {
//	public static void main(String[] args) {
//		ServiceBean service = ServiceBeanFactory.getProxyInstance(new CglibDynamicProxy("boss"));
//		service.create();
//		ServiceBean service2 = ServiceBeanFactory.getProxyInstance(new CglibDynamicProxy("admin"));
//		service2.create();
//	}
	
	public static void main(String[] args) {
		ServiceBean service = ServiceBeanFactory.getAuthInstanceByFilter(new CglibDynamicProxy("boss"));
		ServiceBean service2 = ServiceBeanFactory.getAuthInstanceByFilter(new CglibDynamicProxy("admin"));
		service.create();
		service.query();
		service2.create();
		service2.query();
		
	}
}
