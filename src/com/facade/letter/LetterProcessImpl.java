package com.facade.letter;

public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void fillEncelope(String address) {
		System.out.println("��д�����˵���������ַ ...."+address);
	}
	//���ŷ����ŷ��У������
	@Override
	public void letterInotoEncelope() {
		System.out.println("���ŷŵ��ŷ���.....");
		
	}

	@Override
	public void sendLetter() {
		System.out.println("�ʵ��ż�....");
		
	}

	@Override
	public void writeContext(String context) {
		System.out.println("��д�ŵ�����...."+context);
		
	}

}
