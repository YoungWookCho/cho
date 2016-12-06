package com.hanbit.animal;

public class Hamster extends Animal {
	
	public static final String DEFAULT_NAME = "햄토리";
	
	
	protected String getDefaultName(){

		return DEFAULT_NAME;
	}
	
	
	public Hamster(String kind, String color) {
		
		super(DEFAULT_NAME, kind, color);
	}

	
	public Hamster(String name, String kind, String color) {
		
		super(name, kind, color);
	}
	


}
