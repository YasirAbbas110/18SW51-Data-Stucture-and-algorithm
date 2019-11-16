import java.util.*;
//import java.util.LinkedList;

class Person
{
	protected String name;
	protected int age;
	protected String gender;
	public Person(String name, int age, String gender)
	{
		this.name = name;
		this.age=age;
		this.gender=gender;
	}
}
class Student extends Person
{
	public String rollno;
	public long pno;
	public Student(String name, int age, String gender,String rollno, long pno)
	{
		super(name,age,gender);
		this.rollno=rollno;
		this.pno=pno;
	}
	public String toString()
	{
		return "Name = "+this.name+", Age = "+this.age+", Gender = "+this.gender+", Roll NO = "+this.rollno+", Phone Number = "+this.pno;
	}
}
class LinkedListExample
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Yasir",18,"Male","18SW51",03067071110);
		Student s2 = new Student("Toseef",17,"Male","18TL52",03067071110);
		Student s3 = new Student("Usama",17,"Male","18SW52",03067071110);
		Student s4 = new Student("Qadeer",18,"Male","18XX00",03067071110);
		Student s5 = new Student("Moiz",18,"Male","18CS51",03067071110);
		Student s6 = new Student("Fayaz",18,"Male","18SW21",0344533);
		LinkedList<Student> object = new LinkedList<Student>();
		object.add(s1); // adds element in last endex 
		object.add(s2);
		object.add(s3);
		object.addFirst(s4); // adds element in last index
		object.addLast(s5); //adds elemet in last index
		for(int i=0;i<object.size();i++)  // for loop iterates elements of Linked list and size() method returns the size of list
		System.out.println(object.get(i)); // get method is used to return an object of linked list
		object.offer(s6);
		System.out.println(object.get(5));
		System.out.println(object.peek()); //Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(object.peekLast()); //Retrieves, but does not remove, the last element of this list, or returns null if this list is empty
		System.out.println(object.poll()); //Retrieves and removes the head (first element) of this list.
		System.out.println(" ");
		for(int i=0;i<object.size();i++) 
		System.out.println(object.get(i));
		System.out.println(object.size());
		object.remove(0); // removes element @ perticular index
		System.out.println(object.size());
		object.set(1,s4); // replaces element with given element @ given index
		System.out.println(object.size());
		object.clear(); // removes alla elements from the list
		System.out.println(object.size());
	}
}