package Test3;

import java.util.Scanner;

public class Electricity {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the Unit Consume ");
int u=sc.nextInt();
double bill=0;
if(u<=50)
	bill=(u*0.5);
else if(u<=150)
bill=50*0.5+(u-50)*0.75;
else if(u<=250)
	bill=0.5*50+100*0.75+(u-150)*1.2;
else
	bill=50*0.5+100+0.75+100*1.2+(u-250);
double total=1.2*bill;
System.out.println("Total Bill is="+total);
	}

}
