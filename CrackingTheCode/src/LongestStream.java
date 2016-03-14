/* Find the longest streaming of 1 if an array consist of O and 1 . Only K 0s can be flipped to ones.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class LongestStream {
	public static void main(String[] args){
		int[] arr = new int[]{0,0,0,0,1,1,1,0,1,1};
		int k = 4;// number to flip from O to 1
		System.out.println(longestStream(arr,k));
	}
	
	public static int longestStream(int[] arr, int k){
		int prevCount = 0;
		int count = 0;
		int temp = k;
		int start = 0;
		for(int i=0;i< arr.length;i++){
			if(arr[i] == 1){
				count++;
			}
			else if(temp >0 && temp < k ){
				temp--;
				count++;
			}
			else if(temp == k){
				temp--;
				count++;
				start = i;
			}
			else{
				if(count >= prevCount){
			   		prevCount = count;	
				}
				i = start;	
				temp = k;
				count = 0;
			   	start = temp;	
					
				}
				

			}

		if(count >= prevCount){
   			prevCount = count;
		}
		return prevCount;




	}
}
