package com.tandemloopscreeningtest;

//Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]

public class Problem4
{
	 public static void main(String args[])
	 {
	     int input[] = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
	     int result[] = new int[10];
	
	     for (int i = 1; i <= 9; i++)
	     {
	         int count = 0;
	         for (int num : input)
	         {
	             if (num % i == 0) 
	            	 count++;
	         }
	         result[i] = count;
	     }
	
	     for (int i = 1; i <= 9; i++)
	     {
	         System.out.print(i + " : " + result[i]+",	");
	     }
	 }
}
