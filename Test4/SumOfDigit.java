package Test4;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		int sum=0;
		while(0<num)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
