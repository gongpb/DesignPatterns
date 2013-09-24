package com.builder.carModel;

import java.util.ArrayList;

/**
 * ������
 * @author gong_pibao
 */
public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder  bmwBuilder  = new BMWBuilder();
	/**
	 * A�ͱ��ۣ���start Ȼ�� stop 
	 * @return
	 */
	public BenzModel getABenzModel(){
		//����ǰ��
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	/**
	 * B�ͺŵı��ۣ� �ȷ������棬Ȼ��������Ȼ��ֹͣ
	 */
	public BenzModel getBBenzModel(){
		//����ǰ��
		this.sequence.clear();
		this.sequence.add("engineBoom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	/**
	 * C�ͱ����Ȱ����ȣ�Ȼ��������ֹͣ
	 */
	public BMWModel getCBMWModel(){
		//����ǰ��
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BMWModel)this.bmwBuilder.getCarModel();
	}
	/**
	 * D�ͱ���ֻ��һ�����ܾ�����
	 */
	public BMWModel getDBMWModel(){
		//����ǰ��
		this.sequence.clear();
		this.sequence.add("start");
		this.benzBuilder.setSequence(sequence);
		return (BMWModel)this.bmwBuilder.getCarModel();
	}
}
