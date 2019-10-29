/*Write a method in Java program to find the second largest element in an array. Method should
take array as input and return index*/
class Task5{
	public static int secondLargestElement(int[] array)
	{
		int max=array[0];
		int smax = max;
		for(int i=0;i<array.length;i++)
		{
			if(max<array[i])
			{
				smax=max;
				max=array[i];
			}
		}
		return smax;
	}
	public static void main(String[] args)
	{
		int[] myArray = {9,2,4,9,5,1,7,3,10,0};
		System.out.println("Second largest element in the array is "+secondLargestElement(myArray));
	}
}