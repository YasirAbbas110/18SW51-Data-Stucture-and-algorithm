import java.util.*;
class QueueDemo
{
	public static void main(String[] args)
	{
		Queue<String> q = new PriorityQueue<>();
		q.add("Yasir");
		q.add("Abbas");
		q.add("Qadeer");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.poll());
		System.out.println(q);
		q.clear();
		//System.out.println(q.poll());
		//System.out.println(q.poll());
		//System.out.println(q.poll());
		//System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.element());
		/*
		Queue<String> l = new LinkedList<>();
		l.add("Yasir");
		l.add("Abbas");
		l.add("sahito");
		l.add("Moiz");
		l.add("Uddin");
		System.out.println(l);*/
		//Queue<String> aq = new AbstractQueue<>();
		//aq.add("Lund");
		//System.out.println(aq);
	}
}