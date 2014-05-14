package com.flyweight.sign3;
/**
 * 线程不安全了
 * 设置的享元对象数量太少，导致每个线程都到对象池中获得对象，然后去修改其属性，
 * 于是就出现了一些不和谐数据。只要使用java开发，线程问题就是不可避免的，那我们怎么
 * 避免这个问题呢？享元模式是让我们使用共享技术，而java的多线程又有如此问题，改如何设计呢？
 * 没什么可以参考的标准，只有依靠经验，在需要地方考虑一下线程安全，大部分的场景下都不用考虑
 * 我们使用享元模式时，对象池中的享元对象尽量多，多到满足业务为止
 * @author gong_pibao
 *
 */
public class Client {
	public static void main(String[] args) {
		//在对象池中初始化4个对象
		SignInfoFactory.getSignInfo("科目1");
		SignInfoFactory.getSignInfo("科目2");
		SignInfoFactory.getSignInfo("科目3");
		SignInfoFactory.getSignInfo("科目4");
		//取得对象
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
		// 初始化对象池
		for(int i=100; i>0; i--)
		{
			signInfo.setId("zhangSan");
			signInfo.setLocation("zhangSan");
			(new MultiThread(signInfo)).start();
			
			signInfo.setId("liSi");
			signInfo.setLocation("liSi");
			(new MultiThread(signInfo)).start();
		}
	}

}
