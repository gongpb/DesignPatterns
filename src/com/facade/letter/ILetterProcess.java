package com.facade.letter;

public interface ILetterProcess {
	//����д�ŵ�����
	public void writeContext(String context);
	//���д�ŷ�
	public void fillEncelope(String address);
	//���ŷŵ��ŷ���
	public void letterInotoEncelope();
	//Ȼ��ȥ�ʵ�
	public void sendLetter();
}
