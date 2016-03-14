package datastructures;

public class BalanceParanthesis {
	public static void main(String[] args){
		String str = "((x+y/(z-w)))";
		boolean balanced =  isBalanced(str);
		if(balanced){
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
	
	public static boolean isBalanced(String str){
		char[] arr = new char[str.length()];
		int top =-1;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '('){
				arr[i] = '(';
				top++;
			}
			else {
				if(str.charAt(i) == ')' && top != -1){
					top--;
				}
			}
			
		}
		if(top != -1)
			return false;
		return true;
	}
}
