package com.java.practice;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number :");
		Scanner	ip = new Scanner(System.in);
		int a=ip.nextInt();
		int factorial=1;
		for(int i=1;i<=a;i++) {
			factorial =factorial * i;
		}
		System.out.println("Factorial  of Given number is : "+factorial);
		ip.close();
	}

}
