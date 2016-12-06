package com.hanbit.java;

public class FirstClass {

	
	//멤버변수는 초기화를 안해줘도 초기 값을 갖고 있음
	int number;
	int sum;
	
	FirstClass(int number){
		this.number = number;
	}
	
	int getNumber(){
		return number;
		
	}
	
	int addNumber(int add){
		number+=add+1;
		int sum = number;
		this.sum=sum;
		return number;
	}
	
	static int a(){
	return -1;
	}
	
}
