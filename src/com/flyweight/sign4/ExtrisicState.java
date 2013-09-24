package com.flyweight.sign4;

/**
 * һ��Ҫ��дequals��hashCode ��������������ΪHashMap �е�keyֵ�Ǹ���û������ģ�
 * ֻ��hashCodeֵ��ȣ�����equals���ؽ��Ϊtrue�������������ȣ�
 * Ҳֻ������������²��п��ܴӶ�����в��һ�ö���
 * ע�⣺�����һ��������ΪMap��ļ�ֵ��һ��Ҫȷ����д��equals��hashCode ����������
 * ����ͨ����ֵ����ʧ�ܵ����
 * @author gong_pibao
 */
public class ExtrisicState {
	private String location;    //���Եص�
	private String subject;     //���Կ�Ŀ
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ExtrisicState)
		{
			ExtrisicState state = (ExtrisicState) obj;
			return state.getLocation().equals(location)&&state.getSubject().equals(subject);
		}
		return false;
	}
//	@Override
//	public int hashCode() {
//		int code = subject.hashCode() + location.hashCode();
//		System.out.println("=========="+code);
//		return code;
//	}
}
