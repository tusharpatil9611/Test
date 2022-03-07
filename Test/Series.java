package Test;
import java.util.*;

public class Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any no ");
		int k=sc.nextInt();
		System.out.print("Series is ");
		System.out.println(k++ - ++k + k-- - k++ + ++k-k-- + --k+k+k-- -k + --k+k++);
	}

}
