package Algorithms;

	public class SelectionSort{
		public static void main(String[] args){
			int[] arr = new int[]{32,21,15,12,11};
			for(int i=0;i< arr.length -1;i++){
				int minIndex = i;
				for(int j= i+1;j< arr.length;j++){
					if(arr[j]< arr[minIndex])
					   minIndex = j;
				}
				swap(i,minIndex,arr);
			}
			for(int num:arr){
				System.out.println(num);
			}
			
		}	


		public static void swap(int num1,int num2 , int[] arr){
		
			int temp = arr[num1];
			arr[num1] = arr[num2];
			arr[num2] = temp;
		}

	
}
