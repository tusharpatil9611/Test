package Test18Nov;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=0;i<=6;i++)
		{
			int count=0;
			for(int j=0;j<=12;j++)
			{
				if(j+i<=6 || j-i>=6)
				{
					if(j<=5)
						System.out.print((char)(65+count++));
					else
						System.out.print((char)(65+12-j));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
