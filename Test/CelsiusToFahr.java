package Test;
import java.util.*;
public class CelsiusToFahr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temp in to the Celsius ");
		double c=sc.nextDouble();
		double F=32+(c*9/5);
		System.out.println("Temp ic Fahre="+F);
	}

}
