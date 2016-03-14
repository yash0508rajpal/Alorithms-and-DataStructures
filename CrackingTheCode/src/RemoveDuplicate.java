import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args){
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] str = input.toCharArray();
		removeDuplicates(str);
	}
	
	public static void removeDuplicates(char[] str){
		if(str == null)
			return; 
		if(str.length < 2)
			return;
		
		int tail = 1;
		for(int i= 1;i < str.length;++i){
			int j;
			for(j= 0;j < tail;++j){
				if(str[i] == str[j])
					break;
			}
				if(j == tail){
					str[tail] = str[i];
					++tail;
				}
				str[tail] = 0;
		}
		
		for(int i=0;i< str.length;i++){
			System.out.print(str[i]);
		}
	}
}
