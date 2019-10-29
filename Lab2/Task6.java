//Write a java program to sort a matrix (Two dimensional array)
import java.util.Arrays;
class Task6{
	public static void main(String[] args)
	{
		int[][] myArray = {{1,6,3},{5,4,2}};
		for(int i=0;i<myArray.length;i++)
		{
			Arrays.sort(myArray[i]);
		}
		printArray(myArray);
	}
	public static void printArray(int arg[][])
	{
		for(int j=0;j<arg.length;j++){
			for(int i=0;i<arg[j].length;i++)
			{
			System.out.print(arg[j][i]+" ");
			}
			System.out.println("");
		}
	}
}