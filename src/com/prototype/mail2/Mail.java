package com.prototype.mail2;
/**
 * �ʼ�
 * ������һ��Cloneable�ӿڣ���java�Դ��Ľӿ�
 * @author gong_pibao
 */
public class Mail implements Cloneable{
	private String receiver;     //�ռ���
	private String subject;      //�ʼ�����
	private String appellation;  //��ν
	private String content ;     //�ʼ�����
	private String tail ;        //�ʼ���β����һ�㶼����"XXX��Ȩ����"����Ϣ
	//���췽��
	public Mail (AdvTemplate advTemplate){
		this.content = advTemplate.getAdvContent();
		this.subject = advTemplate.getAdvSubject();
	}
	@Override
	protected Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
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
