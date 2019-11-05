class BinarySearch
{
	public static int binary_search(int[] array,int target) // method searches for index of array if found return index else any -ve no
	{
		int l=0;
		int u=array.length-1;
		while(l<=u)
		{
			int i = (l+u)/2;
			if(array[i]==target)//if condition checks compares element with given one
			{
				return i;
			}
			if(array[i]<target)
			{
				l=i+1;
			}
			if(array[i]>target)
			{
				u=i-1;
			}
		}
			return -1;
	}
	public static void main(String[] args) //main method
	{
		int[] a = {1,2,3,4,5,6};
		int x = binary_search(a,6);//calling method
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