package Test11Dec;

public class Q5 {

	public static void main(String[] args) 
	{
		int [][] a={{1,2,3,4},
					{4,5,6,7},
					{7,8,9,1},
					{1,2,3,4}};
		int sum=0;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if(i==0 || j==0 || i==a.length-1 || j==a[i].length-1)
				{
				
				}
				else
				{	
					sum =sum+a[i][j];
					count++;
				}
			}
		}
	System.out.println(count);
	System.out.println(sum);
		System.out.println((sum*1.0)/count);
	}

}
