package com.flyweight.sign2;
/**
 * 享元模式有太大的几率发送线程不安全
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		// 初始化对象池
		for (int i = 0; i < 2; i++) {
			String subject = "科目" + i;
			// 初始化地址
			for (int j = 0; j < 6; j++) {
				String key = subject +"考试地点" + j ;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
	}

}
