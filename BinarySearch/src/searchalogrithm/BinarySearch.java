package searchalogrithm;

import java.util.Scanner;

class BinarySearch{
	public static void main(String[] args){
		int[] arr = new int[]{1,3,5,7,9,11};
		System.out.println("Enter number to search");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int index = search(arr,0,arr.length-1,key);
		if(index == -1){
			System.out.println("Number " + key + " not found");
		}
		else
			System.out.println("Number " + key + " found at index " + index);
	
	}

	public static int search(int[] arr,int l,int r,int key){
		if(l<=r){
			int m = l + (r-l)/2;
			if(arr[m] == key){
				return m;
			}
			else if(arr[m] > key){
				return search(arr,l,m-1,key);
			
			}
			else{
				return search(arr,m+1,r,key);
			}
		}
		return -1;
	
	}


}