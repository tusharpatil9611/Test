package Teat27Nov;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args)
	{
		int []a={1,2,3,4,5,6,7,8,9};
	
		int temp=a[0];
		for (int i = 0; i < a.length-1; i++) 
		{
			a[i]=a[i+1];
			
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	}

}
