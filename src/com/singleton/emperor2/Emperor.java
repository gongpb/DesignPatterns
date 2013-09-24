package com.singleton.emperor2;

import java.util.ArrayList;
import java.util.Random;

/**
 * �̶������Ļʵ���
 * @author gong_pibao
 */
public class Emperor {
	//���Ժ�����ܲ�����ʵ������
	private static final int maxNumOfEmperor = 5;
	//ÿ���ʵ۶������֣�ʹ��ArrayList�����ɣ�ÿ�������˽������
	private static ArrayList<String> nameList = new ArrayList<String>();
	//����һ���б��������лʵ�ʵ��
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
	//��ǰ�ʵ۵����
	private static int countNumOfEmperor = 0;
	static {
		for (int i=0; i<maxNumOfEmperor; i++){
			emperorList.add(new Emperor("�� "+i+" ��"));
		}
	}
	private Emperor(){
		//Ŀ���ǲ������ڶ����ʵ�
	}
	//����ʵ����ƣ�����һ���ʵ۶���
	private Emperor(String name){
		nameList.add(name);
	}
	//������һ���ʵ۶���
	public static Emperor getInstance(){
		Random random = new Random();
		//���ȡ��һ���ʵۣ�ֻҪ�Ǹ���������ͳ�
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		
		return emperorList.get(countNumOfEmperor);
	}
	//�ʵ�˵����
	public static void say(){
		System.out.println("���ǣ�"+nameList.get(countNumOfEmperor));
	}
}
