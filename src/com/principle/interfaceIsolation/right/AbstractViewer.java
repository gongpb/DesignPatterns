package com.principle.interfaceIsolation.right;

public abstract class AbstractViewer {
	protected IGreatTemperamentGirl prettyGirl;
	
	public AbstractViewer (IGreatTemperamentGirl prettyGirl){
		this.prettyGirl = prettyGirl;
	}
	
	public abstract void show();
	
}
