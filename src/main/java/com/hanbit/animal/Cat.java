package com.hanbit.animal;

import org.apache.commons.lang3.StringUtils;

public class Cat extends Animal {
	
	public static final String DEFAULT_NAME = "야옹이";
	
	
	protected String getDefaultName(){

		return DEFAULT_NAME;
	}
	
	
	public Cat(String kind, String color) {
		
		super(DEFAULT_NAME, kind, color);
	}

	
	public Cat(String name, String kind, String color) {
		
		super(name, kind, color);
	}


	
	

}
