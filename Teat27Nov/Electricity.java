package Teat27Nov;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill units");
		int unit=sc.nextInt();
		double bill=0;
		if(unit<50)
		{
			bill=(0.5*unit);
		}
		else if(unit<150)
		{
			bill=(0.5*50)+(unit-50)*0.75;
		}
		else if(unit<250)
		{
			bill=(0.5*50)+(0.75*100)+(unit-150)*1.2;
		}
		else
		{
			bill=(0.5*50)+(0.75*100)+(100*1.2)+(unit-250)*1.5;
		}
		double total=1.2*bill;
		System.out.println("Total Bill is "+total);
	}

}
