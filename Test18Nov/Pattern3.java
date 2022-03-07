package Test18Nov;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=8;j++){
				if(j-i<=0)
					System.out.print(9-j);
			}
			System.out.println();
		}

	}

}
