package Test3;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Char");
		char ch=sc.next().charAt(0);
		char c=Character.toUpperCase(ch);
		switch(c)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("This is a Vowel");
			break;
		default:
			System.out.println("This is Not a Vowel");
		}
		

	}

}
