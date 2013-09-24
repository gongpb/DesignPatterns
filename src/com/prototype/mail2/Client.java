package com.prototype.mail2;

import java.util.Random;

/**
 * ԭ��ģʽ
 * ������
 * ����һ�����̣߳��ǰ���һ��0.02�룬600����ʼ���Ҫ33��Сʱ��
 * Ҳ����˵һ���춼�����꣬����Ĳ�����ȥ��������˵��ֲ�����,
 * �ջ����ۣ��ͻ��Ͳ�Ը���ˡ���sendMail�Ķ��̣߳�������Ҳ��������ģ�
 * ������һ���ʼ����󣬷ŵ��߳�1�����У���û�з���ȥ���߳�2Ҳ�����ˣ�
 * ֱ�Ӱ��ʼ�����mail���ռ��˵�ַ�ͳ�νȥ���ˣ��̲߳���ȫ��,
 * ������ԭ��ģʽ����������
 * mail.clone():�Ѷ����Ƴ�һ�ݣ�����һ���µĶ��󣬺�ԭ�ж���һ����
 * Ȼ�����޸�ϸ�ڵ����ݣ������ó�ν�������ռ��˵ȣ����ֲ�ͨ��new��������
 * ����ͨ����������ʵ�ֵ�ģʽ��ԭ��ģʽ
 * @author gong_pibao
 */
public class Client {
	//�����˵������������ֵ�Ǵ����ݿ��л��
	private static int MAX_COUNT = 6;
	public static void main(String[] args) {
		//ģ�ⷢ���ʼ�
		int i=0;
		//��ģ�嶨�Ժ����������Ǵ����ݿ��л��
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XXX���а�Ȩ����");
		while( i<MAX_COUNT )
		{
			//������ÿ���ż���ͬ�ĵط�
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5)+"  ����(Ůʿ) ");
			cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
			//���ʼ�
			sendMail(cloneMail);
			i++;
		}
	}
	//�����ż�
	public static void sendMail(Mail mail){
		System.out.println("���⣺" + mail.getSubject() + "\t�ռ��ˣ�"
				+ mail.getReceiver()+"\t...���ͳɹ���");
	}
	//���ָ�����ȵĶѻ��ַ���
	public static String getRandString(int maxLength){
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for(int i=0; i<maxLength; i++)
		{
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}
