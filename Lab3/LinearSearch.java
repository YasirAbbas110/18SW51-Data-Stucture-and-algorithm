class LinearSearch
{
	public static int linear_search(int[] array,int target) // method searches for index of array if found return index else any -ve no
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==target)//if condition checks compares element with given one
			{
				return i;
			}
		}
			return -1;
	}
	public static void main(String[] args) //main method
	{
		int[] a = {1,2,3,4,5,6};
		int x = linear_search(a,5);//calling method
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