package com.syntax.class09;

public class Deneme {

	public static void main(String[] args) {
		
		
		System.out.println("-------CARS ARRAY------");
		
		
	String[] cars= {"Mercedes","Hyundai", "BMW", "Porsche", "Toyota", "Tofas"};
	
		
	for(int a=0; a<cars.length; a++) {
		
		
		System.out.println(cars[a]);
	}
		
		
		System.out.println("-----advance for loop/ enhanced for loop/for each loop");
		
		//advance for loops used for only collections and arrays
		
	
		for(String car:cars) {
			System.out.println(car);
		}
		
		
		System.out.println("--------NUMBERS ARRAY----------");
		
		int[]numbers= {100,20,67,45,90,23};
		
		
//1.yol 
		
		for(int l=0; l<numbers.length; l++) {
			System.out.println(numbers[l]);
		}
		
		System.out.println("---advance---");
		
//2.yol	
		for(int num:numbers) {
			System.out.println(num);
		}
		
		
		
		
	}

}
