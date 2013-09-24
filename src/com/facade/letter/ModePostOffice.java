package com.facade.letter;

public class ModePostOffice {
	private ILetterProcess letterProcess = new LetterProcessImpl();
	private Police police = new Police();
	//开始写信、封装、投递，一体化
	public void sendLetter(String context, String address){
		//帮你写信
		letterProcess.writeContext(context);
		//写好信封
		letterProcess.fillEncelope(address);
		police.checkLetter(letterProcess);
		//把信放入信封
		letterProcess.letterInotoEncelope();
		//邮递信件
		letterProcess.sendLetter();
	}
}
