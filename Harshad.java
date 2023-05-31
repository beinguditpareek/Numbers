package com.numbers;

public class Harshad 
{
	public static void main(String[] args) {
		
		int num = 156;
		int sum = 0;
		int rem;
		
		while(num>0)
		{
			rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		
		if(num%sum == 0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("Not a Harshad Number");
		}
	}

}
