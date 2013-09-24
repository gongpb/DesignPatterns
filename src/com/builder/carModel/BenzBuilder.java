package com.builder.carModel;

import java.util.ArrayList;
/**
 * 奔驰车组装者
 * @author gong_pibao
 */
public class BenzBuilder extends CarBuilder {
	BenzModel benz = new BenzModel();
	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}

}
