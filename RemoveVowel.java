import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveVowel
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		System.out.println("The String after Vowel Removal is: ");
		String str2=str.replaceAll("[aeiouAEIOU]","");
		System.out.println(str2);
	}
}