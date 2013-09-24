package com.flyweight.sign3;

/**
 * 多线程场景
 * 
 * @author gong_pibao
 */
public class MultiThread extends Thread {
	private SignInfo signInfo;
	public MultiThread(SignInfo signInfo){
		this.signInfo = signInfo;
	}
	@Override
	public void run() {
		if(!signInfo.getId().equals(signInfo.getLocation()))
		{
			System.out.println("编号：" + signInfo.getId()+"\t考试地址：" + signInfo.getLocation());
			System.out.println("线程不安全了......");
		} 
		else
		{
			System.out.println("-------------编号：" + signInfo.getId()+"\t考试地址：" + signInfo.getLocation());
		}
	}
}
