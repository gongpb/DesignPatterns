package com.builder.carModel;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		///////////////////////////////////////////////////
		//���run��˳��
//		ArrayList<String> sequence = new ArrayList<String>();
//		sequence.add("engineBoom"); //�ͻ�Ҫ����ȥ����ʱ��Ҫ�ȷ�������
//		sequence.add("start"); // ����
//		sequence.add("stop");  //ֹͣ
//		//---------------���챼�۳�-----------
//		//����һ�����۳�
//		BenzBuilder benzBuilder = new BenzBuilder();
//		//����װ˳���builder�࣬�����һ������
//		benzBuilder.setSequence(sequence);
//		//�����һ�����۳�
//		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//		//���۳���һ�¿���
//		benz.run();
//		System.out.println("\n");
//		//---------------���챦��-----------
//		BMWBuilder bmwBuilder = new BMWBuilder();
//		bmwBuilder.setSequence(sequence);
//		BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
//		bmw.run();
		
		/////////////////////////////////////////////
		Director director =  new Director();
		//����10��A�ͱ���
		for(int i=0; i<10; i++){
			//A�ͱ��۳�������
			director.getABenzModel().run();
		}
	}
}
