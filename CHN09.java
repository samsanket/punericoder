package CodeChef;

import java.util.*;
import java.lang.*;
import java.io.*;

class CHN09
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next();
		    int n=s.length(),a=0,b=0,i;
		    for(i=0;i<n;i++)
		    {
		        if(s.charAt(i)=='a')
		         a++;
		        else
		         b++;
		    }
		    if(a==0 || b==0)
		     System.out.println(0);
		    else
		     System.out.println(Math.min(a,b));
		}
	}
}