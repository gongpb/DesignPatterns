package com.principle.interfaceIsolation.right;

public class Client {
	public static void main(String[] args) {
		IGreatTemperamentGirl girl = new PrettyGirl("ÍõÓïæÌ");
		AbstractViewer viewer = new Viewer(girl);
		viewer.show();
	}
}
