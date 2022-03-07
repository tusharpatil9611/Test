package Test3;

import java.util.Scanner;
public class FindDigitCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		if('a'<=ch && 'z'>=ch)
			System.out.println("It is a Character");
		else if(48 <=ch && 57 >=ch)
			System.out.println("it is a Digit");
		else
			System.out.println("It is a Special Character");
	}

}
