package Test11Dec;
//Write a program to compare two string lexographicaly. 
public class Q1 {

	public static void main(String[] args) 
	{
		String s="abce";
		String s1="abd";
		int count=0;
		System.out.println(s.compareTo(s1));
		for (int i = 0; i <s.length() && i<s1.length(); i++) 
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				count++;
				System.out.println(s.charAt(i)-s1.charAt(i));
				break;
			}
		}
		if(count==0)
			System.out.println(s.length()-s1.length());
		
	}

}
