package com.builder.carModel;

import java.util.ArrayList;

/**
 * 导演类
 * @author gong_pibao
 */
public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder  bmwBuilder  = new BMWBuilder();
	/**
	 * A型奔驰，先start 然后 stop 
	 * @return
	 */
	public BenzModel getABenzModel(){
		//清理前景
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	/**
	 * B型号的奔驰， 先发到引擎，然后启动，然后停止
	 */
	public BenzModel getBBenzModel(){
		//清理前景
		this.sequence.clear();
		this.sequence.add("engineBoom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	/**
	 * C型宝马，先按喇叭，然后启动，停止
	 */
	public BMWModel getCBMWModel(){
		//清理前景
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BMWModel)this.bmwBuilder.getCarModel();
	}
	/**
	 * D型宝马，只有一个功能就是跑
	 */
	public BMWModel getDBMWModel(){
		//清理前景
		this.sequence.clear();
		this.sequence.add("start");
		this.benzBuilder.setSequence(sequence);
		return (BMWModel)this.bmwBuilder.getCarModel();
	}
}
