package Task;

import java.util.Scanner;

class Example{
	public static void main(String[] args)
	{
		String s;
		String res="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		s=scan.next();
		for(int i=0;i<s.length();i++)
		{
			if(i==0||i==1)
			{
				if(s.charAt(i)=='A')
				{
					continue;
				}
				else {
					res=res+s.charAt(i);
				}
			}
			else {
				res=res+s.charAt(i);
			}
		}
		System.out.println(res);
	}
}