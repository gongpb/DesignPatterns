package com.flyweight.sign4;
/**
 * ������Ϣ
 * @author gong_pibao
 */
public class SignInfo extends ExtrisicState{
	//������Աid
	private String id;
	private String postAddress; //�ʼĵ�ַ
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostAddress() {
		return postAddress;
	}
	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}
	
}
