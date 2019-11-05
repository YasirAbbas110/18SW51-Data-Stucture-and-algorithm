class BinarySearchString
{
	public static int binary_search(String[] array,String target) // method searches for index of array if found return index else any -ve no
	{
		int l=0;
		int u=array.length-1;
		while(l<=u)
		{
			int i = (l+u)/2;
			int temp = array[i].compareToIgnoreCase(target);
			if(temp==0)//if condition checks compares element with given one
			{
				return i;
			}
			if(temp>0)
			{
				l=i+1;
			}
			if(temp<0)
			{
				u=i-1;
			}
		}
			return -1;
	}
	public static void main(String[] args) //main method
	{
		String[] a = {"Yasir","Sarwan","Anees"};
		int x = binary_search(a,"ANEES");//calling method
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