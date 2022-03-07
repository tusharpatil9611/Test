package Test;

import java.util.Scanner;

public class SwappingWith {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no a ");
		int a=sc.nextInt();
		System.out.println("Enter the second No b ");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping a "+a);
		System.out.println("After Swapping b "+b);
	}

}
