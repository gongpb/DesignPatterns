package com.flyweight.sign3;
/**
 * 报考信息
 * @author gong_pibao
 */
public class SignInfo {
	//报考人员id
	private String id;
	private String location;    //考试地点
	private String subject;     //考试科目
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
	private String postAddress; //邮寄地址
	
	
}
