package com.flyweight.sign;

public class Client {
	//�ӹ����л��һ������
	SignInfo signInfo = SignInfoFactory.getSignInfo();
	//����������ҵ���߼�
	StringBuffer sb = new StringBuffer();
}
