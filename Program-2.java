package com.tandemloopscreeningtest;

//Problem-2: With a single integer as the input, generate the following until a = x

import java.util.Scanner;

class Problem2
{
	public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter Number: ");
	     int a = sc.nextInt();
	     System.out.print("Output: ");
	     for (int i = 0; i < a; i++)
	     {
	    	 int odd = 2*i+1;
	         System.out.print(odd + " ");
	     }
	}
}
