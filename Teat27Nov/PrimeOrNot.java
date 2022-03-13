package Teat27Nov;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		int count=0;
		for (int i = 2; i <=num-1; i++) 
		{
			if(num%i==0)
				count++;
		}
		if(count==0)
			System.out.println("No is Prime No");
		else
			System.out.println("No is not Prime No");

	}

}
