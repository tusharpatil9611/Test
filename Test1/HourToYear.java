package Test1;
import java.util.*;
public class HourToYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Hour =");
		int H=sc.nextInt();
		int Year=H/8760;
		int rem=H%8760;
		System.out.println("No of Year is="+Year);
		int week=rem/168;
		int rem1=rem%168;
		System.out.println("No of Weeks is="+week);
		int days=rem1/24;
		int rem2=rem1%24;
		System.out.println("No of Days is="+days);
		System.out.println("No of Hour Remaining="+rem2);

	}

}
