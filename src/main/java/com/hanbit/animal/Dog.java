package com.hanbit.animal;

import org.apache.commons.lang3.StringUtils;

public class Dog {
	
	public static final String DEFAULT_NAME = "멍멍이";
	private String name;
	//파이널은 초기화를 해줘야함 
	//생성자에서나 처음 선언할때 초기화를 해야함.
	//private final String kind;
	private final String kind;
	private String color;
	
	
	public Dog(String kind, String color){
		// 다른생성자가 있을때 불러오게 하는 방법
		this(DEFAULT_NAME,kind,color);

	}
	
	
	public Dog(String name, String kind, String color){
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	
	public String toString(){
		return name+":"+kind+":"+color;
		
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		
		if (StringUtils.isBlank(name)){
			name = DEFAULT_NAME;
		}
		this.name = name;
	}
	
	public String getKind() {
		return kind;
	}
	


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		
		if (StringUtils.isBlank(color)){
			return;
		}
		this.color = color;
	}
	




	
	

}
