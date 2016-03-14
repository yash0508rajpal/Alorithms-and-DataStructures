/*Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures
 * 
 *  
 *  */


import java.util.Scanner;

public class UniqueCharacters{
	public static void main(String[] args){
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean isUnique = isUnique(input);
		if(isUnique)
			System.out.println("unique");
		else
			System.out.println("not unique");
	}
	
	public static boolean isUnique(String str){
		boolean[] charBuffer = new boolean [256];
		for(int i=0;i< str.length();i++){
			int val = str.charAt(i);
			if(charBuffer[val]){
				return false;
			}
			charBuffer[val] = true;
		}
		
		
		return true;
	}


}