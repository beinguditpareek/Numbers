package com.numbers;

public class Palindrome 
{
	public static void main(String[] args) {
	
	int num = 121;
	int sum = 0;
	int rem,temp;
	temp=num;
	
	
	while(num>0)
	{
		rem = num%10;
		sum = (sum*10) + rem;
		num = num/10;
	}
	
	if(sum==temp)
	{
		System.out.println("Palindrome Number");
	}
	else
	{
		System.out.println("Not a Palindrome Number");
	}
	
	}
}
