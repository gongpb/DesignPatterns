package com.factory.human;

public class HumanFactory extends AbstractHumanFactory{
//人类创建工厂
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			 human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return (T)human;
	}

}
