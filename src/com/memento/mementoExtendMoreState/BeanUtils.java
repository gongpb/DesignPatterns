package com.memento.mementoExtendMoreState;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {
	//��bean���������Լ���ֵ����Hashmap��
	public static HashMap<String , Object> backUpProp(Object bean){
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			//��ȡbean����
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			//�����������
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			//������������
			for(PropertyDescriptor des:descriptors)
			{
				//��������
				String fieldName = des.getName();
				//��ȡ���Եķ���
				Method getter =des.getReadMethod();
				//��ȡ����ֵ
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
	
	//��HashMap ��ֵ���ص�bean��
	public static void restoreProp(Object bean, HashMap<String ,Object> propMap){
		//��ȡBean����
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			//��ȡ��������
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			//�������е�����
			for(PropertyDescriptor des:descriptors)
			{
				//��������
				String fieldName = des.getName();
				//������������
				if(propMap.containsKey(fieldName))
				{
					//д���Եķ���
					Method setter = des.getWriteMethod();
					setter.invoke(bean, new Object[]{propMap.get(fieldName)});
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
