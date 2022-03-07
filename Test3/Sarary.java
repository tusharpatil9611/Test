package Test3;
import java.util.*;
public class Sarary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Salary of the Employ");
		int s=sc.nextInt();
		if(s<=1000)
		{
			double sal=(s+0.2*s+0.8*s);
			System.out.println("Total Salary is="+sal);
		}
		else if(s<=20000)
		{
			double sal=(s+0.25*s+s*0.9);
			System.out.println("Total Salary is="+sal);
		}
		else
		{
			double sal=(s+0.3*s+0.95*s);
			System.out.println("Total Salary is="+sal);
		}
		
		}


	}

