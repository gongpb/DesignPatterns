package com.prototype.prototype;

/**
 * ԭ�����
 * ʵ��һ��java�Ľӿ�Cloneable��������дclone����
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
