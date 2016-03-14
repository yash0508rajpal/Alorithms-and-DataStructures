import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args){
		System.out.println("Enter 1st strings");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("Enter 2nd strings");
		String s2 = sc.next();
		boolean isAnagram = anagrams(s1,s2);
		if(isAnagram){
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
	
	public static boolean anagrams(String str1,String str2){
		
		if(str1 == null || str2 == null)
			return false;
		if(str1.length() != str2.length())	
			return false;

		if(str1.length() < 2)
			return false;

		int[] buffer = new int[256];
		for(int i=0;i < str1.length();i++){
			buffer[str1.charAt(i)]++;
			buffer[str2.charAt(i)]--;
		}
		for(int j=0;j< buffer.length;j++){
			if(buffer[j] != 0)
			return false;
		}


		return true;


	}
}
