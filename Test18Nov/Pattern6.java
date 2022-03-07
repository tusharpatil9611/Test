package Test18Nov;

public class Pattern6 {

	public static void main(String[] args) {
		int count=1;
		int start=1;
		for(int i=0;i<=4;i++)
		{
			count=start;
			int diff=4;
			for(int j=0;j<=4;j++)
			{
				if(j-i<=0)
					System.out.print(" "+count);
				count=count+diff;
				diff--;
				
			}
			System.out.println();
				start++;
		}

	}

}
