import java.io.*;
class test
{
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null)
		{
			//One Method to find Second last Word
			
			String str=s.substring(0,s.lastIndexOf(" "));
			String str1=str.substring(str.lastIndexOf(" ")+1,str.length());
			System.out.print(str1);
			
			//Second Method to find Second last word #NOT WORKING
			
			String[] arr=s.split(" ");
			String result=arr[arr.length-2];
			System.out.print(result);
		}
	}
}