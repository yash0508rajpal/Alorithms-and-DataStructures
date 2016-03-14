/*
 * Find common numbers between 2 arrays
 */
public class CommonNumbers {
	public static void main(String[] args){
		int[] arr2 = new int[]{1,3,4,4,5};
		int[] arr1 = new int[]{1,5,7,9};
		commonNumbers(arr1,arr2);
	}
	
	
	public static void commonNumbers(int[] arr1,int[] arr2){
		int max = arr2[0];
		int maxLength = Math.max(arr1.length, arr2.length);
		for(int i=0;i< maxLength;i++){
			if(i < arr2.length &&arr2[i] > max){
				max = arr2[i];
			}
			if(i < arr1.length && arr1[i] > max){
				max = arr1[i];
			}
		}
		int[] buffer = new int[max+1];
		int maxLen = Math.max(arr1.length, arr2.length);
		for(int j=0;j< arr2.length;j++){
				buffer[arr2[j]]++;	
		}
		for(int j=0;j< arr1.length;j++){
			if(buffer[arr1[j]] > 0){
				System.out.println(arr1[j]);
			}
			
		}
		
		
		
	}
}
