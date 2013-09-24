package com.flyweight.sign4;

/**
 * 一定要覆写equals和hashCode 方法，否则它作为HashMap 中的key值是根本没有意义的，
 * 只有hashCode值相等，并且equals返回结果为true，两个对象才相等，
 * 也只有在这种情况下才有可能从对象池中查找获得对象
 * 注意：如果把一个对象作为Map类的键值，一定要确保重写了equals和hashCode 方法，否则
 * 出现通过键值搜索失败的情况
 * @author gong_pibao
 */
public class ExtrisicState {
	private String location;    //考试地点
	private String subject;     //考试科目
	
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
