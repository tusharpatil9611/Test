package Test;
import java.util.*;
public class CompoundIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal Amount =");
		int p=sc.nextInt();
		System.out.println("Enter the Rate of Intrest=");
		int r=sc.nextInt();
		System.out.println("Enter the no of time intern applied per time=");
		int n=sc.nextInt();
		System.out.println("Enter time Preiod Elapsed=");
		int t=sc.nextInt();
		double a=1+(r/(n*100.0));
		double b=n*t;
		double amount=p*Math.pow(a, b);
		System.out.println("Compound Intrest="+amount);
	}

}
