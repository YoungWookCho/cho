package com.hanbit.animal;

import org.apache.commons.lang3.StringUtils;

public abstract class Animal {
	
	
	protected String name;
	protected  String kind;
	protected String color;
	
	
	public Animal (String name, String kind, String color){
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	
	
	protected abstract String getDefaultName();
	
	
	public String toString(){
		
		return name+":"+kind+":"+color+":";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if (StringUtils.isBlank(name)){
			name = getDefaultName();
		}
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		if (StringUtils.isBlank(color)){
			color = getDefaultName();
		}
		this.color = color;
	}


	public String getKind() {
		return kind;
	}
	
	


}
