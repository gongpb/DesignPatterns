package com.facade.letter;

public class Client {
	public static void main(String[] args) {
		String context = "hello: Founder...信的内容";
		String address = "开始写信封：北京市海淀区方正国际大厦";
		//--------------普通方法-------------------
		System.out.println("--------普通方法---------");
		//创建一个处理信件的过程
		ILetterProcess letterProcess = new LetterProcessImpl();
		//开始写信
		letterProcess.writeContext(context);
		//开始写信封
		letterProcess.fillEncelope(address);
		//把信放到信封里吗，并封装好
		letterProcess.letterInotoEncelope();
		//投递
		letterProcess.sendLetter();
		
		//--------------门面模式----------------------------
		System.out.println("\n---------门面模式---------");
		ModePostOffice postOffice = new ModePostOffice();
		postOffice.sendLetter(context, address);
	}
	
}	
