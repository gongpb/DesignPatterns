package com.flyweight.sign3;
/**
 * �̲߳���ȫ��
 * ���õ���Ԫ��������̫�٣�����ÿ���̶߳���������л�ö���Ȼ��ȥ�޸������ԣ�
 * ���Ǿͳ�����һЩ����г���ݡ�ֻҪʹ��java�������߳�������ǲ��ɱ���ģ���������ô
 * ������������أ���Ԫģʽ��������ʹ�ù���������java�Ķ��߳�����������⣬���������أ�
 * ûʲô���Բο��ı�׼��ֻ���������飬����Ҫ�ط�����һ���̰߳�ȫ���󲿷ֵĳ����¶����ÿ���
 * ����ʹ����Ԫģʽʱ��������е���Ԫ�������࣬�ൽ����ҵ��Ϊֹ
 * @author gong_pibao
 *
 */
public class Client {
	public static void main(String[] args) {
		//�ڶ�����г�ʼ��4������
		SignInfoFactory.getSignInfo("��Ŀ1");
		SignInfoFactory.getSignInfo("��Ŀ2");
		SignInfoFactory.getSignInfo("��Ŀ3");
		SignInfoFactory.getSignInfo("��Ŀ4");
		//ȡ�ö���
		SignInfo signInfo = SignInfoFactory.getSignInfo("��Ŀ2");
		// ��ʼ�������
		for(int i=100; i>0; i--)
		{
			signInfo.setId("zhangSan");
			signInfo.setLocation("zhangSan");
			(new MultiThread(signInfo)).start();
			
			signInfo.setId("liSi");
			signInfo.setLocation("liSi");
			(new MultiThread(signInfo)).start();
		}
	}

}
