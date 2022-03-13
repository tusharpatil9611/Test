package Test4Nov;

public class Q2Queue {
	static int []a=new int [5];
	static int index=0;
	 public static int pop()
	 {
		 if(index==0)
		 {
			 System.out.println("Queue is Empty ");
			 return 0;
		 }
		 else 
		 {
			 int temp=a[0];
			 for (int i = 1; i < a.length; i++)
			 {
				a[i-1]=a[i];
				index--;
			 }
			 return temp;
		 }
	 }
	 public static void push(int num)
	 {
		 if(index<a.length)
		 {
			 a[index++]=num;
					 
		 }
		 else 
			 System.out.println("Queue is Full ");
	 }
	 public static void print()
	 {
		 for (int i = 0; i < a.length; i++)
		 {
			System.out.print(a[i]+" ");
		 }
		 System.out.println();
	 }
	
	public static void main(String[] args)
	{
		push(100);
		push(90);
		push(80);
		push(70);
		push(60);
		push(50);
		System.out.println(pop());
		print();
	}

}
