package Test4Nov;

import java.util.Arrays;

public class Q4reverse {

	public static void main(String[] args)
	{
		int []a={20,55,66,89,12,62};
		int i=0;
		int j=a.length-1;
		while(j>i)
	
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}

}
