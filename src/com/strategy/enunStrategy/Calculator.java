package com.strategy.enunStrategy;

/**
 * ö�ٲ�����һ���ǳ����㡢�����ģʽ����������ö�����͵�����
 * ÿ��ö�����public��final��static ����չ���ܵ���һ������Լ
 * @author gong_pibao
 */
public enum Calculator {
    /**ͨ�����Ÿ�ֵ,���ұ����д��ι�������һ���Ը�����������������
     * ��ֵ�����Ƕ���ֵ�򶼲���ֵ������һ���ָ�ֵһ���ֲ���ֵ
     * �������ֵ����д����������ֵ����Ҳ����
     * ���Զ���һ�����󷽷������Ǳ��������Եķ�����ʵ��������󷽷�,����������
     **/
	//�ӷ�����
	ADD("+"){
		@Override
		public int exec(int a, int b) {
			 return a+b;
		}},
	//��������
	SUB("-"){
		@Override
		public int exec(int a, int b) {
			return a-b;
		}
	};
	
	String value = "";
	//�����Աֵ����
	private Calculator(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	//����һ��������
	public abstract int exec(int a, int b);
}
