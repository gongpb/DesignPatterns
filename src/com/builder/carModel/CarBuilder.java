package com.builder.carModel;

import java.util.ArrayList;

/**
 * 抽象建造者
 * @author gong_pibao
 */
public abstract class CarBuilder {
	//建立一个模型，你给我一个顺序
	public abstract void setSequence(ArrayList<String> sequence);
	//设置完成之后就可以直接拿到车的模型了
	public abstract CarModel getCarModel();
}
