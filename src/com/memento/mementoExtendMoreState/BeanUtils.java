package com.memento.mementoExtendMoreState;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {
	//把bean的所有属性及数值放入Hashmap中
	public static HashMap<String , Object> backUpProp(Object bean){
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			//获取bean描述
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			//获得属性描述
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			//遍历所有属性
			for(PropertyDescriptor des:descriptors)
			{
				//属性名称
				String fieldName = des.getName();
				//读取属性的方法
				Method getter =des.getReadMethod();
				//读取属性值
				Object fieldValue = getter.invoke(bean, new Object[]{});
				if(!fieldName.equalsIgnoreCase("class"))
				{
					result.put(fieldName, fieldValue);
				}
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e){
			e.printStackTrace();
		} catch (IllegalAccessException e){
			e.printStackTrace();
		} catch (InvocationTargetException e){
			e.printStackTrace();
		}
		return result;
	}
	
	//把HashMap 的值返回到bean中
	public static void restoreProp(Object bean, HashMap<String ,Object> propMap){
		//获取Bean描述
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			//获取属性描述
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			//遍历所有的属性
			for(PropertyDescriptor des:descriptors)
			{
				//属性名称
				String fieldName = des.getName();
				//如果有这个属性
				if(propMap.containsKey(fieldName))
				{
					//写属性的方法
					Method setter = des.getWriteMethod();
					setter.invoke(bean, new Object[]{propMap.get(fieldName)});
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
