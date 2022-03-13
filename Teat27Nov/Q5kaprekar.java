package Teat27Nov;
import java.util.*;
public class Q5kaprekar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		int temp=num;
		int sq=num*num;
		
		int count=0;
		while(0<temp)
		{
			temp=temp/10;
			count++;
		}
		int num2=(int)Math.pow(10,count);
		int pt1=sq/num2;
		int pt2=sq%num2;
		int total=pt1+pt2;
		if(num==total)
			System.out.println("No is Kaprekar");
		else
			System.out.println("No is not Kaprekar");
		
	}
}
