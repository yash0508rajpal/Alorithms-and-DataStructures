
public class HeapSort {
	private static int N;
	public void buildHeap(int[] arr){
		N = arr.length-1;
		for(int i=N/2;i>=0;i-- ){
			heapify(arr,i);
		}
	}
	
	public void heapify(int[] arr,int i){
		int left = 2*i+1;
		int right = 2*i +2;
		int largest;
		if((left <= N) && arr[left] > arr[i]){
			largest = left;
		}
		else{
			largest = i;
		}
		if(right <=N && arr[right] > arr[largest]){
			largest = right;
		}
		if(largest != i){
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr,largest);
		}
		
		
		
	}
	
	public void heapSort(int[] arr){
		for(int i= N;i>0;i--){
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			//Change size of heap
			N--;
			heapify(arr,0);
		}
		
	}


public static void display(int[] arr){
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i] + " ");
	}
}
}
