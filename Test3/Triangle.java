package Test3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of the Triangle a ,b,c");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a+b<c || b+c<a || a+c<b )
	System.out.println(" Invalid Input");
else if(a==b && b==c && c==a)
System.out.println("The Triangle is Equilateral");
else if(a==b || b==c )
	System.out.println("The Triangle is Isosceles Triangle");
else
	System.out.println("The Triangle is Scalent Triangle ");
	}

}
