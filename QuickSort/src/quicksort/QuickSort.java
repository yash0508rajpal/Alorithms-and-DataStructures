package quicksort;

public class QuickSort{
	public void sort(int[] arr,int low,int high){
		if(low < high){
			int pivot = partition(arr,low,high);
			sort(arr,low,pivot-1);
			sort(arr,pivot+1,high);
		}
		
	}


public int partition(int[] arr,int low,int high){
	int pivot = arr[high];
	int i= low -1;
	for(int j=low;j<=high-1;j++){
		if(arr[j] <= pivot){
			i++;
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}
	
	int temp = arr[high];
	arr[high] = arr[i+1];
	arr[i+1] = temp;
	return i+1;
	
}

public static void display(int[]arr){
	for(int i=0;i< arr.length;i++){
		System.out.print(arr[i] + " ");	
			
	}
}
}