//Insertion sort
class InsertionSort
{
	public static void main(String[] args) {
		int arr[]={4,3,5,1,9};
		for(int i =0;i<arr.length;i++)
		{
			int key = arr[i],j;
			for(j=i-1;j>=0 && arr[j] > key;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+",");
		}
	}
}