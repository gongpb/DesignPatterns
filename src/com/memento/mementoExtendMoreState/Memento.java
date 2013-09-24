package com.memento.mementoExtendMoreState;

import java.util.HashMap;

/**
 * 备忘录角色
 * @author gong_pibao
 */
public class Memento {
	//接受HashMap作为状态
	private HashMap<String ,Object> stateMap;

	public HashMap<String, Object> getStateMap() {
		return stateMap;
	}
	public void setStateMap(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
	//接受一个对象，建立一个备份
	public Memento(HashMap<String ,Object> map){
		this.stateMap = map;
	}
}
