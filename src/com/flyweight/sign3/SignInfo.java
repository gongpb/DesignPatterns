package com.flyweight.sign3;
/**
 * ������Ϣ
 * @author gong_pibao
 */
public class SignInfo {
	//������Աid
	private String id;
	private String location;    //���Եص�
	private String subject;     //���Կ�Ŀ
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPostAddress() {
		return postAddress;
	}
	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}
	private String postAddress; //�ʼĵ�ַ
	
	
}
