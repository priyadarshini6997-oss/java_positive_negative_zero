package com.index;

import java.util.Scanner;

public class Test_Ass6_pro2 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter a number: ");
	 int num = sc.nextInt();
	 
	 if(num>0) {
		 System.out.println("It is a positive number.");
	 }else if(num<0) {
		 System.out.println("It is a negative number.");
	 }else {
		 System.out.println("The number is zero.");
	 }
	 sc.close();

	}

}
