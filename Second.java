import java.util.*;

class Second
{
	public static void main(String args[])
	{
		TreeSet t=new TreeSet(new Sec_c());
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("Z");
		t.add("X");
		t.add("Y");
		System.out.println(t);
	}
}

class Sec_c implements Comparator
 {
	public int compare(Object o1,Object o2)
	 {
		String s1=(String)o1;
		String s2=(String)o2;
		return -s1.compareTo(s2);
	 }
 }

