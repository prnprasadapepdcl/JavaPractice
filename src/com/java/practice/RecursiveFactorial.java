package com.java.practice;

import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	ip = new Scanner(System.in);
		int a=ip.nextInt();
		System.out.println("Factorial  of Given number is : "+fact(a));
		ip.close();
	}
	public static int fact(int n) {
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
		
	}

}
