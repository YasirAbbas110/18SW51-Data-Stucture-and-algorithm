class LinearSearchChar
{
	public static int linear_search(char[] array,char target) // method searches for index of array if found return index else any -ve no
	{
		for(int i=0;i<array.length;i++)
		{
			int temp = Character.compare(Character.toLowerCase(array[i]),Character.toLowerCase(target));
			if(temp==0)//if condition checks compares element with given one
			{
				return i;
			}
		}
			return -1;
	}
	public static void main(String[] args) //main method
	{
		char[] a = {'a','E','i','o','u'};
		int x = linear_search(a,'x');//calling method
		if(x>-1)
		{
			System.out.println("Index of element is "+x);
		}
		else
		{
			System.out.println("Element not found");	
		}

	}
}