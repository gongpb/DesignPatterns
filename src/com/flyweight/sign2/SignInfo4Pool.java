package com.flyweight.sign2;

/** 
 * Ϊʲô����key�� ʹ�����ࣿ 
 * ���е�SingInfo������һЩ���ԣ����Կ�Ŀ�Ϳ� �Եص㣬���ǰ���Щ������Ϊ���ж�����ⲿ״̬��
 * ������������һ��������ⲿ״ֻ̬��һ�����󡣰��������ƣ����Ƕ���keyֵ�ñ�׼Ϊ��
 * ���Կ�Ŀ+���Եص� �ĸ����ַ�����ΪΨһ�ĳض����׼��Ҳ����˭�ڶ�����У�һ��keyֵΨһ
 * ��Ӧһ������
 * �ڶ�����У�����һ����������Ȼ��һ��Ψһ�ġ��ɷ��ʵ�״̬��ʾ���󣬶��ҳ��еĶ�����������
 * ���г�������������������ʹ���߾����ġ�
 * @author gong_pibao
 *
 */
public class SignInfo4Pool extends SignInfo{
	//����һ���������ȡ��keyֵ
	private String key;
	//���캯�������ͬ��־
	public SignInfo4Pool(String kye){
		this.key = key;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
