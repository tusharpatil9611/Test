package Test1;

import java.util.Scanner;

public class RootEquation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First term a ");
		int a=sc.nextInt();
		System.out.println("Enter the Seconf term b ");
		int b=sc.nextInt();
		System.out.println("Enter the Third term c ");
		int c=sc.nextInt();
		double d=(b*b)-(4*a*c);
		double root=Math.pow(d,1/2.0);
		int f=2*a;
		if(d<0){
			System.out.println("Complex Root");
		}
		else{
			double root1=((-b+root)/f);
			double root2=((-b-root)/f);
			System.out.println("Root is="+root1);
			System.out.println("Root is="+root2);
		}
		
		
		
		
	}

}
