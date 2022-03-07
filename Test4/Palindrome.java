package Test4;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			sum=sum*10+num%10;
			num=num/10;
			
		}
		if(temp==sum)
		System.out.println("the given no is palindrim");
		else
			System.out.println("the no is Not palindrom");
	}

}
