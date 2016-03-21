import java.util.Scanner;

/*
 * Given an n x n matrix, where every row and column is sorted in increasing order. 
 * Given a number x, how to decide whether 
 * this x is in the matrix. 
 * The designed algorithm should have linear time complexity.
 * 
 * 
 */

public class SearchKey {
	public boolean search(int[][] arr,int num, int n){
		int i =0;
		int j= n-1;
		while(i < n && j>=0){ // go extreme highest value to the right of the row
			if(arr[i][j] == num){
				return true;
			}
			else if(arr[i][j] < num)
				i++;
			else{ // arr[i][j] > num
				j--;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args){
		int[][] matrix = new int[][]{{1,2,3,4},
									 {5,6,7,8},
									 {9,10,11,12},
									 {13,14,15,16}
									};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search");
		SearchKey sk = new SearchKey();
		boolean found = sk.search(matrix, sc.nextInt(),matrix.length);
		if(found){
			System.out.println("Key found");
			
		}
		else{
			System.out.println("Key not found");
		}
	}
}
