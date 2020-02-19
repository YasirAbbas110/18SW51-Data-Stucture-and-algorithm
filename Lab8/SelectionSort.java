//Selection Sort
class SelectionSort
{
	public static int[] selectionSort(int[] arr)
	{
		int size = arr.length;
		for(int i=0;i<size;i++)
		{
			int min=i;
			for(int j=i+1;j<size;j++)
				if(arr[j]<arr[min])
				{
					min=j;
				}
			if(min!=i)
			{
				int temp = arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		return arr;
	}
	public static void main(String[] args)
	{
		int[] array = {3,12,5,14,3,7,3,5,1};
		selectionSort(array);
		for(int a : array)
			System.out.print(a+",");
	}
}