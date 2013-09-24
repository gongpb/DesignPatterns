package com.prototype.mail;
/**
 * 邮件
 * @author gong_pibao
 */
public class Mail {
	private String receiver;     //收件人
	private String subject;      //邮件名称
	private String appellation;  //称谓
	private String content ;     //邮件内容
	private String tail ;      //邮件的尾部，一般都加上"XXX版权所有"等信息
	//构造方法
	public Mail (AdvTemplate advTemplate){
		this.content = advTemplate.getAdvContent();
		this.subject = advTemplate.getAdvSubject();
	}
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAppellation() {
		return appellation;
	}
	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}
}
