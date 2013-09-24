package com.facade.letter;

public class ModePostOffice {
	private ILetterProcess letterProcess = new LetterProcessImpl();
	private Police police = new Police();
	//��ʼд�š���װ��Ͷ�ݣ�һ�廯
	public void sendLetter(String context, String address){
		//����д��
		letterProcess.writeContext(context);
		//д���ŷ�
		letterProcess.fillEncelope(address);
		police.checkLetter(letterProcess);
		//���ŷ����ŷ�
		letterProcess.letterInotoEncelope();
		//�ʵ��ż�
		letterProcess.sendLetter();
	}
}
