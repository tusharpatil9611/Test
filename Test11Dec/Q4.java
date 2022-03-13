package Test11Dec;

import java.util.Arrays;
									// Unique Pair. 
public class Q4 {

	public static void main(String[] args) 
	{
		int []a={2,4,3,5,6,-2,4,7,8,9};
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
					count++;
			}	
		}
		System.out.println(count);
		int []b=new int [a.length-count];
		int index=0;
		
		for (int i = 0; i < a.length; i++)
		{	int counter=0;
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
					counter++;
			}
			if(counter==0)
				b[index++]=a[i];
		}
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = i; j < b.length; j++)
			{
				if(b[i]+b[j]==7)
				System.out.println(b[i]+" "+b[j]);
			}
		}
				
	}

}
