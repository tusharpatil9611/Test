package Test11Dec;
			// Length of the SubString.
public class Q3 {

	public static void main(String[] args) 
	{
		String s="nbbvuugy";
		int max=0;
		int start=0;
		for (int i = 0; i <s.length(); i++)
		{
			for (int j = i+1; j <s.length(); j++)
			{	
				int count=0;
				for (int k = i; k <i; k++)
				{
					if(s.charAt(j)==s.charAt(k))
						count++;
					break;
				}
			
				if(count>0)
				{
					int lengt=j-i;
					if(lengt>max)
					{
						max=lengt;
						start=i;
					}
					break;
				}
				if(j==s.length()-1)
				{
					int length=j-i+1;
					if(length>max)
					{
						max=length;
						start=i;
					}
				}
			}
			
		}
		System.out.println(max);
		for (int i =start; i <start+max; i++) 
		{
			System.out.print(s.charAt(i)+" ");
		}
	}

}
