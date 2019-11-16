class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
	}
	public Node(int data, Node next)
	{
		this.data=data;
		this.next=next;
	}
}
class LinkedListTest
{
	public static void main(String[] args)
	{
		Node start = new Node(11);
		start.next = new Node(22);
		start.next.next = new Node(33);
		start.next.next.next = new Node(44);
		LinkedListTest obj = new LinkedListTest();
		obj.printList(start);
		obj.insert(start, 25);
		obj.printList(start);
		obj.delete(start,25);
		obj.printList(start);
		System.out.println("Size of List is "+obj.size(start));
		System.out.println("Sum of List is "+obj.sum(start));
		System.out.println(obj.get(start,2)+" is at "+0);
	}
	public void printList(Node start)
	{
		for(Node p = start; p!=null;p=p.next)
		{
			System.out.print(p.data + " , ");
		}
	}
	public Node insert(Node start,int x)
	{
		if(start==null || start.data>x)
		{
			start = new Node(x);
			return start;
		}
		Node p = start;
		while(p!=null)
		{
			if(p.next.data>x)
			{
				break;
			}
			p=p.next;
		}
		/*Node n = new Node(x);
		n.next=p.next;
		p.next = n;*/
		p.next = new Node(x,p.next);
		return start;
	}
	public Node delete(Node start,int x)
	{
		if(start==null || start.data>x)
		{
			return start;
		}
		else if(start.data==x)
		{
			start = start.next;
			return start;
		}
		Node p = start;
		while(p.next!=null)
		{
			if(p.next.data>x)
			{
				//return start;
				break;
			}
			else if(p.next.data==x)
			{
				p.next = p.next.next;
				break;
			}
			p=p.next;
		}
		return p;
	}
	public int size(Node start)
	{
		int count =0;
		Node p = start;
		while(p!=null)
		{
			count++;
			p=p.next;
		}
		return count;
	}
	public int sum(Node start)
	{
		int sum = 0;
		Node p = start;
		while(p!=null)
		{
			sum += p.data;
			p=p.next;
		}
		return sum;
	}
	public int get(Node start, int index)
	{
		Node p = start;
		int count =0;
		while(count!=index)
		{
			p = p.next;
		}
		return p.data;
	}
}