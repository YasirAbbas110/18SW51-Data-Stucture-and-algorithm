class QuickSortdemo
{
	public  static int[] quickSort(int[] a, int p ,int q)
	{
		if(p<q)
		{
			int pivot = partition(a,p,q);
			quickSort(a,p,pivot-1);
			quickSort(a,pivot+1,q);
		}
		return a;
	}
	public static int partition(int[] array, int p, int q) {
		int pivot = q;
		int i = p-1;
		for (int j = p; j <= q; j++) {
			if (array[j] <= array[pivot]) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		return i;

	}//end of method
	public static void main(String[] args)
	{
		//QuickSortdemo obj = new QuickSortdemo();
		int[] arr = {9,2,5,3,5,9,1,8};
		System.out.println("Printing array before sorting");
		for(int a : arr)
		{
			System.out.print(a+",");
		}
		QuickSortdemo.quickSort(arr,0,arr.length-1);
		System.out.println("Printing array after sorting");
		for(int a : arr)
		{
			System.out.print(a+",");
		}
	}
}