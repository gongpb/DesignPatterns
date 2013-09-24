package com.strategy.sanGuo;

public class ZhaoYun {
	public static void main(String[] args) {
		Context context ;
		//刚到吴国的时候，拆开第一个
		System.out.println("-----刚刚到吴国的时候拆开第一个------");
		context = new Context(new BackDoor());  //拿到妙计
		context.operate(); // 拆开执行
		System.out.println("\n");
		
		//刘备乐不思蜀 ，拆开第二个了
		System.out.println("------刘备乐不思蜀 ，拆开第二个了-----");
		context = new Context(new GivenGreenLight());
		context.operate(); // 执行了第二个锦囊
		
		System.out.println("\n");
		//孙权的小兵追了，咋办，拆第三个
		System.out.println("------孙权的小兵追了，咋办，拆第三个------");
		context = new Context(new BlockEnemy());
		context.operate(); //孙夫人断后
	}
}
