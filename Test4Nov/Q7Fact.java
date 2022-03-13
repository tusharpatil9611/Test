package Test4Nov;

import java.util.Scanner;

public class Q7Fact 
{
	public static void main(String [] arg)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the for Factorial");
		int num=sc.nextInt();
		int fact=1;
		for (int i = 1; i <=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("Fact  is "+fact);
	}

}
