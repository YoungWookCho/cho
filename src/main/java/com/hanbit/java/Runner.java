package com.hanbit.java;

import com.hanbit.animal.Cat;
import com.hanbit.animal.Dog;
import com.hanbit.animal.Hamster;

public class Runner {

	public static void main(String[] args) {
		
		
		Dog dog = new Dog("말티즈","흰색");
		Cat cat = new Cat("시베리안","검정");
		Hamster ham = new Hamster("햄스더아이","시베리안","검정");
		ham.setName("");
		
		
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(ham);
		
		
		
		
		
		
		
		//새로운객체를 만들때 new
		//firstClass는 새로운 객체(Object)
		FirstClass firstClass = new FirstClass(3);
		FirstClass secondClass = new FirstClass(4);
		
	
		System.out.println(firstClass.addNumber(5));
		System.out.println(firstClass.addNumber(5));
		System.out.println(secondClass.getNumber());
		
	}
	
}
