import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] str = input.toCharArray();
		reverse(str);
	}
	
	
	
	
	/*public static String reverse(String str){
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0 ;i--){
			sb.append(str.charAt(i));					
		}
		return sb.toString();	
	}*/
	
	public static void reverse(char[] str){
		int len = str.length;
		for(int i=0;i<len/2;i++){
			char temp = str[len-i-1];
			str[len-i-1] = str[i];
			str[i] = temp;
		}
		System.out.println("Reverse String: " + String.valueOf(str) );
	}
	
}
