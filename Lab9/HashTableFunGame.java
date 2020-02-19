import java.util.*;
class HashTableFunGame
{
	public static void main(String[] args) {

	Hashtable<Integer,String> student = new Hashtable();
	student.put(1,"Yasir");
	student.put(2,"Yamin");
	student.put(3,"Sundar");
	student.put(4,"Zain");
	student.put(5,"Vikesh");

	System.out.println("Students "+student);
	Hashtable<String,String> teacher = new Hashtable();
	teacher.put("SirAwais","DSA Lab");
	teacher.put("SirMohsin","DSA");
	teacher.put("SirZahid","SEM");

	System.out.println("Teachers "+teacher);
	Hashtable<String,String> marks = new Hashtable();
	marks.put("DSA Lab","(45,43,23,33,45)");
	marks.put("DSA","(43,40,23,30,45)");
	marks.put("SEM","(50,43,23,37,45)");
	System.out.println("Marks "+marks);
	}
}