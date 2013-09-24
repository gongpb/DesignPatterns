package com.flyweight.sign4;
/**
 * 这中自己编写的类作为外部状态，必须覆写equals方法和hashcode方法，而且效率会比较低
 * 所以外部状态最好以java的级别类型作为标志，如：string、int 可以提升效率
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		ExtrisicState state1 = new ExtrisicState();
		state1.setSubject("科目1");
		state1.setLocation("上海");
		SignInfoFactory.getSignInfo(state1);
		ExtrisicState state2 = new ExtrisicState();
		state2.setSubject("科目2");
		state1.setLocation("上海2");
		long currentTime = System.currentTimeMillis();
		for(int i=0 ; i<10000; i++)
		{
			SignInfoFactory.getSignInfo(state2);	
		}
		long tailTime = System.currentTimeMillis();
		System.out.println("执行时间："+(tailTime - currentTime)+" ms");
	}

}
