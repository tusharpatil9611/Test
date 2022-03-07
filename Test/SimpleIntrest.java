package Test;
import java.util.*;
public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal Amount ");
		int p=sc.nextInt();
		System.out.println("Enter rate of intrest ");
		int r=sc.nextInt();
		System.out.println("Enter the no of year ");
		double n=sc.nextDouble();
		double amount=p*n*r/100;
		System.out.println("Simple Intrest is ="+amount);
		
	}

}
