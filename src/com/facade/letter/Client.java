package com.facade.letter;

public class Client {
	public static void main(String[] args) {
		String context = "hello: Founder...�ŵ�����";
		String address = "��ʼд�ŷ⣺�����к������������ʴ���";
		//--------------��ͨ����-------------------
		System.out.println("--------��ͨ����---------");
		//����һ�������ż��Ĺ���
		ILetterProcess letterProcess = new LetterProcessImpl();
		//��ʼд��
		letterProcess.writeContext(context);
		//��ʼд�ŷ�
		letterProcess.fillEncelope(address);
		//���ŷŵ��ŷ����𣬲���װ��
		letterProcess.letterInotoEncelope();
		//Ͷ��
		letterProcess.sendLetter();
		
		//--------------����ģʽ----------------------------
		System.out.println("\n---------����ģʽ---------");
		ModePostOffice postOffice = new ModePostOffice();
		postOffice.sendLetter(context, address);
	}
	
}	
