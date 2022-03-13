package Teat27Nov;

import java.util.Arrays;

public class Q2Reversing {

	public static void main(String[] args) 
	{
		int []a={12,15,45,98,78};
		int i=0;
		int j=a.length-1;
		while(j>i)
		{
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));

	}

}
