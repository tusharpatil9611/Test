package Test;
import java.util.*;

public class Swapping {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first no a ");
	int a=sc.nextInt();
	System.out.println("Enter the second No b ");
	int b=sc.nextInt();
	int c=a;
	a=b;
	b=c;
	System.out.println("After swapping a "+a);
	System.out.println("After Swapping b "+b);
}
}