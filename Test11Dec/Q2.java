package Test11Dec;

public class Q2 {

	public static void main(String[] args) 
	{
		int []a={11,22,33,44,55,66,77};
		int []b={11,22,33,44,55,66,77};
		int count=0;
		if(a.length==b.length)
		{
			for (int i = 0; i < b.length; i++)
			{
				if(a[i]!=b[i])
				{
					count++;
				}
			}
			if(count==0)
				System.out.println("same");
			else
				System.out.println("Not Same");
		}
		else
			System.out.println("not same"); 		
	}

}
