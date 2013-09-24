package com.prototype.prototype;

/**
 * 原型设计
 * 实现一个java的接口Cloneable，并且重写clone方法
 * @author gong_pibao
 */
public class PrototypeClass implements Cloneable {
	@Override
	protected PrototypeClass clone(){
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass) super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
