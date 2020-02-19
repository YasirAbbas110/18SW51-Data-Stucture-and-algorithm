import java.util.*;
class StackDemo
{
	Scanner input = new Scanner(System.in);
	//pushes the result into the stack.
	public void pushResult(Stack<Integer> s)
	{
		int temp = 0;
		do
		{
			System.out.println("Enter the results or enter -ve value to finish");
			int result = input.nextInt();
			s.push(result);
			temp++;
		}while(temp<=5);
	}
	public void peekResult(Stack<Integer> s)
	{
		System.out.print("Pop : ");
		{
			System.out.println(s.pop());
		}
	}
	public void searchResult(Stack<Integer> s, int element)
	{
		int index = s.search(element);
		if(index==-1)
		{
			System.out.println("Result not found ");
		}
		else
		System.out.println("Result found at index "+index);	
	}
	public void checkResults(Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			System.out.println("Results Stack is empty");
		}
		else
		{
			System.out.println("Results Stack is not empty");
		}
	}
	public static void main(String[] args)
	{
		StackDemo obj = new StackDemo();
		Stack<Integer> myStack = new Stack<>();
	//	obj.pushResult(myStack);
	//	obj.peekResult(myStack);
	//	obj.searchResult(myStack,55);
		obj.checkResults(myStack);
	}
}