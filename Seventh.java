package Collect;

import java.util.ArrayList;

public class Seventh {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<Integer>();
        ArrayList am = new ArrayList<Integer>();
        int x=20;
        for(int i=0;i<20;i++)
        {
            al.add(i);
            am.add(i*10);
        }
System.out.println(al);
System.out.println(am);

        ArrayList ax = new ArrayList();
    

        ax.add(al);
      
       

        ax.add(am);
   
        System.out.println("ax="+ax);
      //  System.out.println(ax.get(2));
        

    }
}
