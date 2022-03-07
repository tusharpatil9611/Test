package Test;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks of Math, phy, che,bio,Eng & IT sub ");
		int a=sc.nextInt();
		//System.out.println("Enter the Marks of 2nd sub ");
		int b=sc.nextInt();
		//System.out.println("Enter the Marks of 3rd sub");
		int c=sc.nextInt();
		//System.out.println("Enter the Marks of 4th sub");
		int d=sc.nextInt();
		//System.out.println("Enter the Marks of 5th sub");
		int e=sc.nextInt();
		//System.out.println("Enter the Marks of 6th sub");
		int f=sc.nextInt();
		int avg=(a+b+c+d+e+f)/6;
		System.out.println("Average of the all Sub is "+avg);
		
	}

}
