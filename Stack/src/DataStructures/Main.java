package DataStructures;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		System.out.println("Enter size of stack");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Stack stack = new Stack(size);
		while(true){
			System.out.println("1: Push ");
			System.out.println("2: Pop ");
			System.out.println("3:Top of the stack");
			System.out.println("4: Exit");
			int input = sc.nextInt();
			switch(input){
			case 1:{
				if(stack.getTop() == size-1){
					System.out.println("Stack is full");
				}
				else{
					System.out.println("Enter number to push");
					int num = sc.nextInt();
					stack.push(num);
					stack.display();
				}
				break;
			}
			case 2:{
				stack.pop();
				stack.display();
				break;
			}
			
			case 3:{
				int topElement = stack.getTopElement();
				System.out.println(topElement);
				break;
			}
			case 4:{
				System.exit(-1);
				break;
			}
			default:{
				System.out.println("Wrong input");
			}
			}
		}
	}
}
