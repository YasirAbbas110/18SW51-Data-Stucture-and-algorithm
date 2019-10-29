/*Write a method in java with float as its return type that takes array as input and return average
as output.*/
class Task4
{
	public static void main(String[] args)
	{
		int[] array1 = {1,2,3,4,5};
		double avg ;
		int sum=0;
		for(int i=0;i<array1.length;i++)
		{
			sum=sum+array1[i];
		}
		avg=sum/array1.length;
		System.out.println(avg);		
	}
}