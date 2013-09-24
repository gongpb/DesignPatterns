package com.factory.factory;
/**
 * 工厂方法模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String [] args){
		Creator creator = new ProductFactory();
		CreateProduct1 product1 = creator.createProdect(CreateProduct1.class);
		product1.method1();
		product1.method2();
		System.out.println("--------------");
		CreateProduct2 product2 = creator.createProdect(CreateProduct2.class);
		product2.method1();
		product2.method2();
	}
}
