package Teat27Nov;

public class Q8Pattern {

	public static void main(String[] args) 
	{
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j-i<=0 && j+i<=8)
					System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
