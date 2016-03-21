import java.util.HashMap;
import java.util.Scanner;

/*
 * Given a number and an array. Find three numbers from the array that their sum equal to the given number.  
 * 
 * 
 */
public class QuickSort {
	
	
	// Function to find the 3 elements in an array whose sum is equal to given number
	
	
	public boolean find3Numbers(int[] arr, int sum){
		for(int i=0;i<arr.length-2;i++ ){
			int j = i+1;
			int k = arr.length-1;
			while(j < k){
				if(arr[i] +arr[j] + arr[k] == sum){
					System.out.println(arr[i] + " " + arr[j] + " "+ arr[k]);
					return true;
				}
				else if(arr[i] + arr[j] + arr[k] < sum){
					j++;
				}
				else{
					k--;
				}
			}
		}
		return false;
		
		
	}
	public int partition(int[] arr,int low, int high){
		int pivot = arr[high];
		int i= low-1;
		for(int j=low;j < high-1;j++){
			if(arr[j]<= pivot){
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp  = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	
	public void sort(int[] arr, int low,int high){
		if(low < high){
			int pivot = partition(arr,low,high);
			sort(arr,low,pivot-1);
			sort(arr, pivot+1,high);
		}
		
		
	}
	
	public static void main(String[] args){
		int[] arr = new int[]{10,30,2,1,55,6,2,3,3,3};
		QuickSort sort = new QuickSort();
		sort.sort(arr,0,arr.length-1);
		/*for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numner");
		int sum = sc.nextInt();
		boolean notAvailable = sort.find3Numbers(arr,sum);
		if(!notAvailable){
			System.out.println("Not Available");
		}
		
		
		
		
	}  
}
