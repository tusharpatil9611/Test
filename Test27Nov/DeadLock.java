package Test27Nov;

public class DeadLock {

	public static void main(String[] args) 
	{
		fifthThread t1=new fifthThread();
		sixThread t2=new sixThread();
		t1.start();
		t2.start();
	}
}
class fifthThread extends Thread
{
	public void run() 
	{
		fifth.m1();
	}
}
class sixThread extends Thread
{
	public void run() 
	{
		six.m1();
	}
}
class fifth
{
	public  static synchronized void m1()
	{
		System.out.println("5-1");
		try {Thread.sleep(100);} catch (Exception e) {}
		six.m2();
		
	}
	public  static synchronized void m2()
	{
		System.out.println("5-2");
	}	
}
class six
{
	public static synchronized void m1()
	{
		System.out.println("6-1");
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		fifth.m2();
	}
	public static synchronized void m2()
	{
		System.out.println("6-2");
	}
}