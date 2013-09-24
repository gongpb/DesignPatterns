package com.builder.carModel;

import java.util.ArrayList;

/**
 * 宝马车组装者
 * @author gong_pibao
 */
public class BMWBuilder extends CarBuilder{
	BMWModel bmw = new BMWModel();
	@Override
	public CarModel getCarModel() {
		return bmw;
	}

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}

}
