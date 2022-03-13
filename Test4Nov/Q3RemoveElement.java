package Test4Nov;

import java.util.Arrays;
import java.util.Scanner;

public class Q3RemoveElement
{
	public static void main(String []arg)
	{
		int []a={52,62,45,88,25,66,12};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int num=sc.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
				count++;
		}
	 int []b=new int [a.length-count];
	 int index=0;
	 for (int i = 0; i < a.length; i++)
	 {
		if(a[i]!=num)
			b[index++]=a[i];
		
 	 }
	 System.out.println(Arrays.toString(b));
	}
}
