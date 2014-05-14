package com.principle.interfaceIsolation.error;

public class Client {
	public static void main(String[] args) {
		IPrettyGirl girl = new PrettyGirl("ÍõÓïæÌ");
		AbstractViewer viewer = new Viewer(girl);
		viewer.show();
	}
}