package com.prototype.mail2;

import java.util.Random;

/**
 * 原型模式
 * 场景类
 * 这是一个单线程，那按照一封0.02秒，600万封邮件需要33个小时，
 * 也就是说一整天都发不完，今天的不发出去，明天的账单又产生了,
 * 日积月累，客户就不愿意了。把sendMail改多线程，这样子也是有问题的，
 * 产生第一封邮件对象，放到线程1中运行，还没有发出去，线程2也启动了，
 * 直接把邮件对象mail的收件人地址和称谓去掉了，线程不安全了,
 * 这里用原型模式解决这个问题
 * mail.clone():把对象复制出一份，产生一个新的对象，和原有对象一样，
 * 然后再修改细节的数据，如设置称谓、设置收件人等，这种不通过new产生对象，
 * 而是通过对象复制来实现的模式叫原型模式
 * @author gong_pibao
 */
public class Client {
	//发送账单的数量，这个值是从数据库中获得
	private static int MAX_COUNT = 6;
	public static void main(String[] args) {
		//模拟发送邮件
		int i=0;
		//把模板定以后出来，这个是从数据库中获得
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XXX银行版权所有");
		while( i<MAX_COUNT )
		{
			//以下是每封信件不同的地方
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5)+"  先生(女士) ");
			cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
			//发邮件
			sendMail(cloneMail);
			i++;
		}
	}
	//发送信件
	public static void sendMail(Mail mail){
		System.out.println("标题：" + mail.getSubject() + "\t收件人："
				+ mail.getReceiver()+"\t...发送成功！");
	}
	//获得指定长度的堆积字符串
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
