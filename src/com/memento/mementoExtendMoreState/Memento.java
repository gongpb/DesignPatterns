package com.memento.mementoExtendMoreState;

import java.util.HashMap;

/**
 * ����¼��ɫ
 * @author gong_pibao
 */
public class Memento {
	//����HashMap��Ϊ״̬
	private HashMap<String ,Object> stateMap;

	public HashMap<String, Object> getStateMap() {
		return stateMap;
	}
	public void setStateMap(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
	//����һ�����󣬽���һ������
	public Memento(HashMap<String ,Object> map){
		this.stateMap = map;
	}
}
