package com.tandemloopscreeningtest;

/*Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
  Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string*/

class Calculator
{
	public double calculate(double a, double b, String operation)
	{
        switch (operation)
        {
            case "add":
            	return a+b;
            case "sub":
            	return a-b;
            case "mul":
            	return a*b;
            case "div":
            	if(b==0)
            	{
            		return 0; //if "b" is zero the result is infinite but since the method returns a double we return 0
            	}
            	else
            	{
            		return a/b;
            	}
            default: 
            	return 0;
        }
    }
	
	public static void main(String args[]) 
	{
		Calculator obj = new Calculator();
        double cal=obj.calculate(21, 9, "mul"); //use only "add", "sub", "mul" or "div" in lowercase for the operation. Uppercase or other strings are return 0
        System.out.println("Calculation : "+cal);
	}
}
