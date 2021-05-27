package CodeChef;

import java.util.Scanner;

public class INFTINCR {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{

            int t=sc.nextInt();
            while(t!=0)
            {
                int n =sc.nextInt();
                 int  arr[]= new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                int c=0;
                
               int x=Integer.MAX_VALUE;
              int f=0;
               r: while(x!=0)
               {
                    for(int i=0;i<n;i++)
                    {
                        arr[i]=arr[i]+i+1;    
                      f=  checkDuplicate(arr,n);
                       if(f==1)
                       {
                           break r;
                       }           
                       c++;  
                        
                    }
                    
                    x--;
               }
                   System.out.println(c);
                   t--;

            }
            sc.close();
            
        }
        catch(Exception e)
        {

        }

       
    }
     public static int checkDuplicate(int [] arr,int n)
    {
        for(int j=0;j<n;j++)
        {
         for(int k=0;k<n;k++)
         {
        if(arr[j]==arr[k]){
             return 1;  }
            }
        }
        return 0;
    }

 
}
