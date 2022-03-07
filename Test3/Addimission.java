package Test3;

import java.util.Scanner;

public class Addimission {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the Marks of Math,Phy,Chem");
		int m=sc.nextInt();
		int p=sc.nextInt();
		int c=sc.nextInt();
		int total=m+p+c;
		int total1=p+m;
		
		if(m>=65 && p>=55 && c>=50)
		{
			if(total>=190)
				System.out.println("Eligable for admission");
			else
				System.out.println("Not Eligable");
		}
			
		else
			if(total1>=140)
				System.out.println("Eligable for Admission");
			else
				System.out.println("Not Eligable");
	}

}
