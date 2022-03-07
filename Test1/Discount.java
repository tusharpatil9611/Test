package Test1;
import java.util.*;
public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost of the pen ");
		int cost=sc.nextInt();
		System.out.println("Enter the discount on Pen Price ");
		int d=sc.nextInt();
		double p=cost*d/100.0;
		System.out.println("Discount on the Pen is ="+p);
		
	}

}
