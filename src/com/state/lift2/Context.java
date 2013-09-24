package com.state.lift2;

/**
 * Context��һ��������ɫ���������þ��Ǹ���״̬�Ĺ��ɣ�
 * LiftState�����������Ƕ��岢�����������ɫ�ۺϽ�����
 * �����ݵ����࣬Ҳ����4�������ʵ�������Լ����ݻ�����
 * ������ν���״̬�Ĺ���
 * @author gong_pibao
 */
public class Context {
	//��������е��ݵ�״̬
	public final static OpenningState openningState = new OpenningState(); 
	public final static ClosingState  closingStete  = new ClosingState();
	public final static RunningState  runningState  = new RunningState();
	public final static StoppingState stoppingState = new StoppingState();
	//��ǰ���ݵ�״̬
	private LiftState liftState;
	public LiftState getLiftState() {
		return liftState;
	}
	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		//�ѵ�ǰ�Ļ���֪ͨ������ʵ����
		this.liftState.setContext(this);
	}
	//��Ϊί��
	public void open(){
		this.liftState.open();
	}
	public void close (){
		this.liftState.close();
	}
	public void run(){
		this.liftState.run();
	}
	public void stop(){
		this.liftState.stop();
	}

}
