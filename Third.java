import java.util.*;

class Third
{
	public static void main(String args[])
	{
		TreeSet t1= new TreeSet(new Sr());
		t1.add(new StringBuffer("Z"));
		t1.add(new StringBuffer("A"));
		System.out.println(t1);
	}
}

class Sr implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		StringBuffer s1=(StringBuffer)o1;
		StringBuffer s2=(StringBuffer)o2;

		return -s1.compareTo(s2);
	}
}

