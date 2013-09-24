package com.flyweight.sign4;
/**
 * 报考信息
 * @author gong_pibao
 */
public class SignInfo extends ExtrisicState{
	//报考人员id
	private String id;
	private String postAddress; //邮寄地址
	
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
