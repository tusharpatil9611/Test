package Test4;

import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First No");
		int num=sc.nextInt();
		System.out.println("Enter the Second No");
		int num1=sc.nextInt();
		
		for(int i=num;i<=num1;i++)
		{
			int counter=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
					counter++;
			}
			if(counter==0)
				System.out.println(i+" No is Prime no");
		}

	}

}
