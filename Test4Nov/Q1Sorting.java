package Test4Nov;
// Write a program to calculate the subtraction and multiplication of two matrices entered by the user.

import java.util.Arrays;

public class Q1Sorting {

	public static void main(String[] args)
	{
		int []a={65,23,89,19,22,2,9,8,1};
		for (int i = 0; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
	}

}
