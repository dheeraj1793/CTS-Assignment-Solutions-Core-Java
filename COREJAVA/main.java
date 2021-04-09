import java.util.*;
class main{
	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		System.out.println(l.isEmpty());
		l.add("A");
		l.add("S");
		l.add(100);
		l.add(10.5);
		l.add(2);
		l.add("A");
		l.add(null);
		System.out.println(l);
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.remove(2));
		System.out.println(l);
		System.out.println(l.remove(Integer.valueOf(2)));
		System.out.println(l);
		System.out.println(l.remove("A"));
		System.out.println(l);
		
	}
}
