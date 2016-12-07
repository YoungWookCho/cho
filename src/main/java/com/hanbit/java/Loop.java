package com.hanbit.java;

public class Loop {


	public static void main(String[] args) {
		/*
		 * countDown 함수를 만들어서 
		 * 입력받은 숫자부터 0까지 출력하시오
		 */
		countDown7(4);


	}

	/**
	 * for each
	 * @param number
	 */
	public static void countDown7(int number){
		int[] numbers = new int [number+1];
		int init  = number;
		for (int i:numbers){
			numbers[init-number]=number--;
			
		}
		for (int i:numbers){
			System.out.println(i);
			
		}
		
	}
	
	

	/**
	 * for each
	 * @param number
	 */
	public static void countDown6(int number){
		int[] numbers = new int [number+1];
		
		for (int i:numbers){
			System.out.println(number--);
		}
	}
	
	
	
	/**
	 * 재귀함수(Recurcive Fuction)
	 * @param number
	 */
	public static void countDown5(int number){
		
		if (number<0){
			return;
		}

		System.out.println(number);

		countDown5(--number);
	}


	/**
	 * 와일문 무한루프형
	 * @param number
	 */
	public static void countDown4(int number){

		while(true){
			System.out.println(number--);

			if (number<0){
				break;
			}
		}
	}

	/**
	 * 와일 조건문
	 * @param number
	 */
	public static void countDown3(int number){
		while(number>=0){
			System.out.println(number);
			number--;
		}
	}

	/**
	 * for문 역순
	 * @param number
	 */
	public static void countDown2(int number){
		for (int i =number ; i>=0; i--){
			System.out.println(i);
		}
	}


	/**
	 * for 문 정순
	 * @param number
	 */
	public static void countDown(int number) {

		for (int i =0 ; i<=number; i++  ){
			System.out.println(number-i);
		}



	}

}
