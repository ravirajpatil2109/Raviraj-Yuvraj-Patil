package com.tandemloopscreeningtest;

//Problem-3: 

import java.util.Scanner;

public class Problem3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        int limit; 
        if(a % 2 == 0)
        {
        	limit = a - 1;
        }
        else 
        {
        	limit=a;
        }
        		
        System.out.print("Output: ");
        for (int i = 0; i < limit; i++)
        {
        	int odd= 2*i+1;
            System.out.print(odd + " ");
        }
    }
}

