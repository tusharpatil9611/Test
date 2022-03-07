package Test1;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of First Variable");
		long a=sc.nextLong();
		System.out.println("Enter the Value of Second Variable");
		long b=sc.nextLong();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a="+a);
		System.out.println("After Swapping b="+b);
	}

}
