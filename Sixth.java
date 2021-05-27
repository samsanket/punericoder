package Collect;

import java.util.ArrayList;

public class Sixth {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<Integer>();
        for(int i=0;i<20;i++)
        {
            al.add(i);

        }
        System.out.println(al);
        Integer x=0;
                for(int i =0 ; i< al.size(); i ++ )
                {
                    x=(Integer)al.get(i);
                    if(x%2!=0)
                    {
                        al.remove(i);
                        al.add(0);
                    }
                    }
                    System.out.println(al);

            }
}
