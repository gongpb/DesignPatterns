package com.flyweight.sign2;
/**
 * ��Ԫģʽ��̫��ļ��ʷ����̲߳���ȫ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		// ��ʼ�������
		for (int i = 0; i < 2; i++) {
			String subject = "��Ŀ" + i;
			// ��ʼ����ַ
			for (int j = 0; j < 6; j++) {
				String key = subject +"���Եص�" + j ;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("��Ŀ1���Եص�1");
	}

}
