package com.java.practice;

import java.util.Scanner;

public class BiggestNumberof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new  Scanner(System.in);
		int a=0,b=0,c=0;
		System.out.println("Biggest of 3 three numbers");
		System.out.println("Enter a value:");
		a=ip.nextInt();
		System.out.println("Enter b value:");
		b=ip.nextInt();
		System.out.println("Enter c value:");
		c=ip.nextInt();
		if(a>b && a>c) {
			System.out.println("A is greater value: "+a);
		}
		else if(b>c) {
			System.out.println("b is greater"+b);
		}
		else
		{
			System.out.println("c is greater:"+c);
		}
		System.out.print("Exit");
		ip.close();
	}

}
