package Test3;
import java.util.*;
public class MaxNum {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three no 1 ,2 ,3");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
	System.out.println("The no is Max no "+a);
else if(b>c && b>a)
System.out.println("The No is Max no "+b);
else
	System.out.println("The no is Max no "+c);
	}

}
