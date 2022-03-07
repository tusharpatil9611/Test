package Test1;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Principal Amount ");
	int p=sc.nextInt();
	System.out.println("Enter the Rate of the Intrest");
	int r=sc.nextInt();
	System.out.println("Enter no of the intrest applied per time period");
	int n=sc.nextInt();
	System.out.println("Enter the no of time periods elaspe");
	int t=sc.nextInt();
	double a=1+(r/(n*100.0));
	double b=n*t;
	double Amount=p*Math.pow(a,b);
	System.out.println("Compound Intrest is="+Amount);
	}
	

}
