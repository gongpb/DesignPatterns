package com.singleton.emperor2;

import java.util.ArrayList;
import java.util.Random;

/**
 * 固定数量的皇帝类
 * @author gong_pibao
 */
public class Emperor {
	//定以后最多能产生的实例数量
	private static final int maxNumOfEmperor = 5;
	//每个皇帝都有名字，使用ArrayList来容纳，每个对象的私有属性
	private static ArrayList<String> nameList = new ArrayList<String>();
	//定义一个列表，容纳所有皇帝实例
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
	//当前皇帝的序号
	private static int countNumOfEmperor = 0;
	static {
		for (int i=0; i<maxNumOfEmperor; i++){
			emperorList.add(new Emperor("皇 "+i+" 帝"));
		}
	}
	private Emperor(){
		//目的是不产生第二个皇帝
	}
	//传入皇帝名称，建立一个皇帝对象
	private Emperor(String name){
		nameList.add(name);
	}
	//随机获得一个皇帝对象
	public static Emperor getInstance(){
		Random random = new Random();
		//随机取出一个皇帝，只要是个精神领袖就成
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		
		return emperorList.get(countNumOfEmperor);
	}
	//皇帝说话了
	public static void say(){
		System.out.println("我是："+nameList.get(countNumOfEmperor));
	}
}
