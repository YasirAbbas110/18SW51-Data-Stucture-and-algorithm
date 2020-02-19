import java.util.*;
class HashTableDemo
{
	public static void main(String[] args) {
		Hashtable<Integer,String> h1 = new Hashtable();
		Hashtable<Integer,String> h2 = new Hashtable();
		h1.put(2,"World");
		h1.put(1,"Hello");
		
		h2 = (Hashtable<Integer,String>)h1.clone();

		System.out.println("Value in clone "+h2);
		h1.clear();
		System.out.println("after clearing "+h1);
		/*System.out.println("Contains Hello "+h2.contains("Hello"));
		System.out.println("Contains hey "+h2.contains("Hey"));
		Enumeration e = h2.elements();
		System.out.println("Displaying ");

		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		Set stay = h2.keySet();
		System.out.println("Displaying " + stay);
		h1.putAll(h2);
		System.out.println("Displaying h1 after put All " + h1);*/
		System.out.println("Contains 1 as key "+h2.containsKey(1));
		System.out.println("Contains3 as key "+h2.containsKey(3));
	}
}