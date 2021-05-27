import java.util.*;
import java.lang.*;
import java.io.*;


class LowerToUpper
{
	public static void main (String[] args)
	{
		int i,len;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.print(Character.toLowerCase(ch));
			else
				System.out.print(Character.toUpperCase(ch));
		}
	sc.close();
	}
}