package Test4Nov;

public class Q5SaddlePoint {

	public static void main(String[] args) 
	{
		int [][]a={{6,3,1},
				   {9,7,3},
				   {2,4,5}};
		int index =0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				boolean isSmalletinRow=true;
				for (int l = 0; l < a[i].length; l++)
				{
					if(a[i][l]<a[i][j])
						isSmalletinRow=false;
				}
				boolean isLargestinCol=true;
				for (int k = 0; k < a.length; k++)
				{
					if(a[k][j]>a[i][j])
						isLargestinCol=false;
				}
				if(isSmalletinRow==true && isLargestinCol==true)
					System.out.println(a[i][j]);
				index++;
			}
		}
		if(index==0)
			System.out.println("Not valid");
	}
}
