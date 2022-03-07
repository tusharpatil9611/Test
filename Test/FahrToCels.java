package Test;
import java.util.*;
public class FahrToCels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Temp into The Fahr");
		int f=sc.nextInt();
		double C=(f-32)*5/9;
		System.out.println("Temp into the celsius is "+C);
	}

}
