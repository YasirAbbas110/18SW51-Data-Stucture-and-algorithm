//Bubble Sort
class BubbleSortDSA
{
	public static int[] bubbleSort(int[] arr) //returns an sorted array
	{
		int size = arr.length; // size var stores length of arr
		for(int i=0;i<size-1;i++)// this loop keeps track of iteration
		{
			for(int j=0;j<size-i-1;j++) // this loop compares the elements in arr 
			{
				if(arr[j]>arr[j+1]) // if next element is greater then the last swap elements 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args)
	{
		int [] array = {3,10,7,12,5,0,5,14}; // initializing array at the time of decleration
		bubbleSort(array); // calling the static method
		for(int a: array) // loop for prnting elements of array
			System.out.print(a+",");
	}
}