package com.facade.letter;

public interface ILetterProcess {
	//首先写信的内容
	public void writeContext(String context);
	//其次写信封
	public void fillEncelope(String address);
	//把信放到信封里
	public void letterInotoEncelope();
	//然后去邮递
	public void sendLetter();
}
