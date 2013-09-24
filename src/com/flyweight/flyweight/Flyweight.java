package com.flyweight.flyweight;

/**
 * 抽象享元角色
 * 抽象享元角色一般为抽象类，在实际项目汇总，一般是一个实现类，它是描述一类事物的方法，
 * 在抽象角色中，一般需要把外部状态和内部状态定义出来，避免子类的随意扩展
 * @author gong_pibao
 */
public abstract class Flyweight {
	//内部状态
	private String intrinsic ;
	//外部状态
	protected final String Extrinsic;
	//要求享元角色必须接受外部状态
	public Flyweight(String Extrinsic){
		this.Extrinsic = Extrinsic ;
	}
	//定义业务操作
	public abstract void operate();
	
	public String getIntrinsic() {
		return intrinsic;
	}
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
}
