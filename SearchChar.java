import java.util.*;
import java.io.*;
import java.lang.*;

class SearchChar
{
	public static void main (String[] args)
	{
		int position=0;
		System.out.println("Enter The String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter The Character to find: ");
		char ch=sc.next().charAt(0);
		position=str.indexOf(ch);
		if(position>0)
			System.out.println("The position of "+ch+" is "+(position+1));
		else
			System.out.println(ch+" is not Present in the Given string");
	}
}