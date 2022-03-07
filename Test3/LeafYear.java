package Test3;
import java.util.*;
public class LeafYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println("Century Leaf Year");
			}
			else{
				System.out.println("The year is Not a Leaf Year");
			}
		}
		else
		{
		if(year%4==0)
		{
			System.out.println("The Year is leaf year");
		}
		else
		{
		System.out.println("The year is not leaf year");	
		}
		}

	}

}
