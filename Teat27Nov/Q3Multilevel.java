package Teat27Nov;

public class Q3Multilevel 
{
	public void add(int num1,int num2)
	{
		System.out.println("Addition is "+(num1+num2));
	}
}
class sub extends Q3Multilevel
{
	public void sub(int a,int b)
	{
		System.out.println("Substraction is "+(a-b));
	}
}
class multi extends sub
{
	public void mult(int a, int b)
	{
		System.out.println("Multiplication  is "+(a*b));
	}
}
class div extends multi
{
	public void div(int a, int b)
	{
		System.out.println("Division is "+(a/b));
	}
	
}
