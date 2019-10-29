/*Write a Java program to remove the duplicate elements of a given array and return the new
length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the
array.*/
class Task7{
	public static void main(String[] args)
	{
		int[] array = {20,20,30,40,50,50,50};
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j = i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
					count++;
			}
		}
		System.out.println("New length of Array after deleting duplicated elements is "+count);
	}
}