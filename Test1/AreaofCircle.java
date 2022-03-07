package Test1;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle ");
		double r=sc.nextInt();
		double pi=3.14;
		double P=2*pi*r;
		System.out.println("Perimeter of the Circle is="+P);
		double Area=pi*r*r;
		System.out.println("Area of the Circle is="+Area);
	}

}
