package com.principle.interfaceIsolation.error;

public abstract class AbstractViewer {
	protected IPrettyGirl prettyGirl;
	
	public AbstractViewer (IPrettyGirl prettyGirl){
		this.prettyGirl = prettyGirl;
	}
	
	public abstract void show();
	
}
