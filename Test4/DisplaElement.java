package Test4;

import java.util.Scanner;

public class DisplaElement {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Starting No");
	int num=sc.nextInt();
	System.out.println("Enter the Ending Digit");
	int num1=sc.nextInt();
	
	for(int i=num;i<=num1;i++)
	{
		if(i%10==7)
			
			System.out.println(i);
	}
	
}
}
