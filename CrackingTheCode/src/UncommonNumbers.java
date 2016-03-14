/* Find uncommon numbers in 2 integer arrays
 * 
 * 
 * 
 * 
 */
public class UncommonNumbers {
	public static void main(String[] args){
		int[] arr2 = new int[]{1,3,77,4,5,6,7,7,7,9};
		int[] arr1 = new int[]{5,1,3,4,11,11,35,25,299,33,55,77,99};
		unCommonNumbers(arr1,arr2);
	}
	
	
	public static void unCommonNumbers(int[] arr1,int[]arr2){
		int maxLen = Math.max(arr1.length,arr2.length);
		int max = arr2[0];
		for(int i=0;i< maxLen;i++){
			if(i < arr2.length && arr2[i] > max){
				max = arr2[i];
			}
			if(i < arr1.length && arr1[i] > max){
				max = arr1[i];
			}
		}
		int maxLength = Math.max(arr1.length, arr2.length);
		int[] buffer = new int[max+1];
		for(int i=0;i < maxLength;i++){
			if(i < arr2.length)		//buffer[arr2[i]] = true;
			buffer[arr2[i]]++;
			if(i < arr1.length)		//buffer[arr2[i]] = true;
				buffer[arr1[i]]++;
			
		}
		
		
		for(int i=0;i< buffer.length;i++){
			if(buffer[i] == 1)
			System.out.println(i);
		}
			
	}
}
