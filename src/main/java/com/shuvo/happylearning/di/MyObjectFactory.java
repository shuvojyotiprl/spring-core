package com.shuvo.happylearning.di;

public class MyObjectFactory {
	
	private String objName;

	private MyObjectFactory(String objName) {
		super();
		this.objName = objName;
	}
	
	public static MyObjectFactory getMyObject(String objName) {
		return new MyObjectFactory(objName);
	}

	@Override
	public String toString() {
		return "MyObjectFactory [objName=" + objName + "]";
	}
	
	
}
