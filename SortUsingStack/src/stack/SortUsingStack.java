/*
 * 
 * 3.6 Write a program to sort a stack in ascending order. You should not make any assumptions about how the stack is implemented. 
 * The following are the only functions that should be used to write this program: push | pop | peek | isEmpty.
 * 
 * 
 * 
 * 
 */

package stack;

import java.util.Stack;

public class SortUsingStack {
	Stack<Integer> stack1;
	
	public SortUsingStack(){
		stack1 = new Stack<Integer>();
	}
	
	public Stack<Integer> sort(){
		Stack<Integer> stack2 = new Stack<Integer>();
		while(!stack1.isEmpty()){
			int temp = stack1.pop();
			while(!stack2.isEmpty() && stack2.peek() > temp){
				stack1.push(stack2.pop());
			}
			stack2.push(temp);
		}
		return stack2;
	}
	
	public static void main(String[] args){
		SortUsingStack s1 = new SortUsingStack();
		s1.stack1.push(10);
		s1.stack1.push(20);
		s1.stack1.push(5);
		s1.stack1.push(3);
		s1.stack1.push(1);
		s1.stack1.push(35);
		Stack<Integer> s2 = s1.sort();
		for(int i=0;i< s2.size();i++){
			System.out.print(s2.get(i) + " ");
		}
	}
	
	
}
