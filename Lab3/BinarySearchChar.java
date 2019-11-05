class BinarySearchChar
{
	public static int binary_search(char[] array,char target) // method searches for index of array if found return index else any -ve no
	{
		int l=0;
		int u=array.length-1;
		while(l<=u)
		{
			int i = (l+u)/2;
			int temp = Character.compare(Character.toLowerCase(array[i]),Character.toLowerCase(target));
			if(temp==0)//if condition checks compares element with given one
			{
				return i;
			}
			if(temp<0)
			{
				l=i+1;
			}
			if(temp>0)
			{
				u=i-1;
			}
		}
			return -1;
	}
	public static void main(String[] args) //main method
	{
		char[] a = {'a','e','i','o','u'};
		int x = binary_search(a,'x');//calling method
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