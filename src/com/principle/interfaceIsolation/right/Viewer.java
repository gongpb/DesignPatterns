package com.principle.interfaceIsolation.right;

public class Viewer extends AbstractViewer{

	public Viewer(IGreatTemperamentGirl prettyGirl) {
		super(prettyGirl);
	}

	@Override
	public void show() {
		super.prettyGirl.greatTemperament();
	}
}
