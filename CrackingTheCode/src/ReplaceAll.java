import java.util.Scanner;

public class ReplaceAll {
	public static void main(String[] args){
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		replaceSpaces(input);
	}
	
	
	public static void replaceSpaces(char[] str){
		//char [] charArr = str.toCharArray();
		int noOfSpace = 0;
		for(char c: str){
			if(c == ' ')	
				noOfSpace++;
		}
		int newLength = str.length + noOfSpace*2;
		char[] newChar = new char[newLength];
		//newChar[newLength] = '\0';
		for(int i=str.length -1;i>=0;i--){
			if(str[i] == ' '){
				newChar[newLength -1] = '0';
				newChar[newLength -2] = '2';
				newChar[newLength -3] = '%';
				newLength = newLength -3;
			}
			else{
				newChar[newLength -1] = str[i];
				newLength = newLength -1;
			}
		}
		System.out.println(newChar);
	}
}


