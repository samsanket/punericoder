import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseString
{
	public static void main (String[] args)
	{
		String str, reverse="";
		System.out.println("Enter The String: ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		/* FIRST METHOD TO REVERSE */
		
		//#start
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		System.out.print(reverse);
		//#end
		
		/* SECOND METHOD TO REVERSE */
		
		//#start
		char[] arr=str.toCharArray();
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		//#end
		
		/* THIRD METHOD TO REVERSE*/
		
		//#start
		String[] arr1=str.split(" ");
		String str1="";
		for(int k=arr1.length-1;k>=0;k--)
		{
			str1+=arr1[k]+" ";
		}
		System.out.println(str1);
		//#end
	}
}