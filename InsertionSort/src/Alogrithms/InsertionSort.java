package Alogrithms;

public class InsertionSort{
	public static void main(String[] args){
		int arr[] = new int[]{56,24,13,15,5,4,3,2,1};
		for(int i=1; i< arr.length;i++){
			int j = i-1;
			int key = arr[i];
		while(j>=0 && arr[j] > key){
			arr[j+1] = arr[j];
			j=j-1;
		}
		arr[j+1] = key;
		}
		for(int num: arr)
			System.out.println(num);

	}


	
}