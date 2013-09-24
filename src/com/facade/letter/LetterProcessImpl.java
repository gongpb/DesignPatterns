package com.facade.letter;

public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void fillEncelope(String address) {
		System.out.println("填写收信人的姓名、地址 ...."+address);
	}
	//把信放入信封中，并封好
	@Override
	public void letterInotoEncelope() {
		System.out.println("把信放到信封中.....");
		
	}

	@Override
	public void sendLetter() {
		System.out.println("邮递信件....");
		
	}

	@Override
	public void writeContext(String context) {
		System.out.println("填写信的内容...."+context);
		
	}

}
