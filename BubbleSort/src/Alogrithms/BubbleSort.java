package Alogrithms;

public class BubbleSort{
	public static void main(String[] args){
		int arr[] = new int[]{54,24,43,67,25};
		for(int i=0;i< arr.length -1;i++){
			boolean swapData = false;
			for(int j=0;j< arr.length-i-1;j++){
				if(arr[j] >  arr[j+1]){
					swap(j,j+1,arr);
					swapData = true;
				}
			
			}
			if(!swapData)
				break;
		}
		for(int num: arr){
		System.out.println(num);
		}
	}


	public static void swap(int num1,int num2, int[]arr){
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;	
	

	}





}