package com.factory.factory;

public class ProductFactory extends Creator{
	 //���幤����
	@Override
	public <T extends Product> T createProdect(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T)product;
	}

}
