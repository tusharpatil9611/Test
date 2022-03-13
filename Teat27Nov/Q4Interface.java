package Teat27Nov;

interface Q4Interface 
{
		public void add(int num1,int num2);
		public void sub(int a, int b);
		public void div(int a, int b);
		public void multi(int a, int b);	
}
abstract class A implements Q4Interface
{
	public void add(int num1,int num2)
	{
		System.out.println("Addition is "+(num1+num2));
	}
	public abstract void sub(int a, int b);
	public abstract void div(int a, int b);
	public abstract void multi(int a, int b);
}
 abstract class B extends A
{
	public void sub (int a, int b)
	{
		System.out.println("Subtraction is "+(a-b));
	}
	public abstract void div(int a, int b);
	public abstract void multi(int a, int b);
}
 class C extends B
{
	public void div(int a, int b)
	{
		System.out.println("Division Is "+(a/b));
	}
	public  void multi(int a,int b)
	{
		System.out.println("Miltiplication is "+(a*b));
	}
}