package com.principle.interfaceIsolation.error;

public class Viewer extends AbstractViewer{

	public Viewer(IPrettyGirl prettyGirl) {
		super(prettyGirl);
	}

	@Override
	public void show() {
		super.prettyGirl.goodLooking();
		super.prettyGirl.niceFigure();
		super.prettyGirl.greatTemperament();
	}
}
