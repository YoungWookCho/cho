package com.hanbit.animal;


public class Dog extends Animal {
	
	public static final String DEFAULT_NAME = "멍멍이";

	public Dog(String kind, String color) {
		this(DEFAULT_NAME, kind, color);
	}
	
	public Dog(String name, String kind, String color) {
		super(name, kind, color);
	}

	@Override
	protected String getDefaultName() {
		return DEFAULT_NAME;
	}
	
}	

	
//	public static final String DEFAULT_NAME = "멍멍이";
//	/*
//	private String name;
//	//파이널은 초기화를 해줘야함 
//	//생성자에서나 처음 선언할때 초기화를 해야함.
//	//private final String kind;
//	private final String kind;
//	private String color;
//	*/
//	
//	protected String getDefaultName(){
//
//		return DEFAULT_NAME;
//	}
//	
//	public Dog(String kind, String color){
//		// 다른생성자가 있을때 불러오게 하는 방법
//		this(DEFAULT_NAME,kind,color);
//System.out.println();
//	}
//	
//	
//	public Dog(String name, String kind, String color){
//		super(name, kind, color);
//		}
//	}
//	
	
