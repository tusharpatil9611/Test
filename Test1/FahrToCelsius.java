package Test1;

import java.util.Scanner;

public class FahrToCelsius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Temp in Fahrenheit");
 double f=sc.nextInt();
 double c=(f-32)*5/9;
 System.out.println("Temp into Celsius is="+c);
 
	}

}
