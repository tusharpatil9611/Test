package Test1;
import java.util.*;
public class EquilateralTringle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the side ");
		int l=sc.nextInt();
		double a=Math.pow(3, 1/2.0);
		double Area=a*l*l/4;
		System.out.println("Area of the Equilateral Tringle is="+Area);
		
		
	}

}
