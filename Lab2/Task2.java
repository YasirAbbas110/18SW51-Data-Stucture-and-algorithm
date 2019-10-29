//Write a Java program to check if two arrays are equal.
import java.util.Arrays;
class Task2
{
	public static void main(String[] args)
	{
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {1,2,3,4,5};
		int[] array3 = {1,2,6,4,5};
		System.out.println(Arrays.equals(array1,array2));		
		System.out.println(Arrays.equals(array1,array3));
		System.out.println(Arrays.equals(array3,array2));
	}
}