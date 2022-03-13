package Test27Nov;

public class Synchronization {

	public static void main(String[] args) throws Exception 
	{
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();
		t1.join();t2.join();
		System.out.println(Addition.i);
		
	}	
}
class Addition
{
	static int i=0;
	public static synchronized void add()
	{
			i=i+1;
	}
}
class thread1 extends Thread
{
	public void run() 
	{
		for (int i = 0; i <1000; i++) 
		{
			Addition.add();
		}
	}
}
class thread2 extends Thread
{
	public void run() 
	{
		for (int i = 0; i <1000; i++) 
		{
			Addition.add();
		}
	}
}