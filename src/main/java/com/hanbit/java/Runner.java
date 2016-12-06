package com.hanbit.java;

import com.hanbit.animal.Dog;

public class Runner {

	public static void main(String[] args) {
		
		
		Dog dog = new Dog("말티즈","흰색");
		System.out.println(dog);
		
		dog.setName("바둑이");
		dog.setColor("검정에 흰점 좀 찍힌..");
		
		System.out.println(Dog.DEFAULT_NAME);
		
		System.out.println(dog.getName());
		System.out.println(dog.getKind());
		System.out.println(dog.getColor());
		
		
		
		
		
		
		//새로운객체를 만들때 new
		//firstClass는 새로운 객체(Object)
		FirstClass firstClass = new FirstClass(3);
		FirstClass secondClass = new FirstClass(4);
		
	
		System.out.println(firstClass.addNumber(5));
		System.out.println(firstClass.addNumber(5));
		System.out.println(secondClass.getNumber());
		
	}
	
}
