package com.flyweight.sign2;

/** 
 * 为什么增加key、 使用子类？ 
 * 多有的SingInfo对象都有一些属性：考试科目和考 试地点，我们把这些共性作为所有对象的外部状态，
 * 在这个对象池中一个具体的外部状态只有一个对象。按照这个设计，我们定义key值得标准为：
 * 考试科目+考试地点 的复合字符串作为唯一的池对象标准，也就是谁在对象池中，一个key值唯一
 * 对应一个对象
 * 在对象池中，对象一旦产生，必然有一个唯一的、可访问的状态表示对象，而且池中的对象声明周期
 * 是有池容器决定，而不是由使用者决定的。
 * @author gong_pibao
 *
 */
public class SignInfo4Pool extends SignInfo{
	//定义一个对象池提取的key值
	private String key;
	//构造函数获得相同标志
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
