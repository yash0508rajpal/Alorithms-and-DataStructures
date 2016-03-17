/*
 * 
 * 
 * 3.2 How would you design a stack which, in addition to push and pop, also has a function min 
 * which returns the minimum element? Push, pop and min should all operate in O(1) time.
 * 
 * 
 * 
 */



package stack;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class LinkedStack {
	Node top;
	int size;
	
	public LinkedStack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public void push(int data){
		Node node = new Node(data, null);
		size++;
		if(top == null){
			top = node;
		}
		else{
			node.setLink(top);
			top = node;
			// Add min element in seperate stack.
		}
	}
	
	public void pushMin(int data){
		Node node = new Node(data,null);
		if(top == null){
			top = node;
		}
		else{
			if(data < top.getData()){
				node.setLink(top);
				top = node;
			}
		}
	}
	
	public int  pop(){ 
		if(isEmpty()){
			throw new NoSuchElementException("Stack Underflow");
		}
		Node ptr = top;
		top = ptr.getLink();
		size--;
		return ptr.getData();
	}
	
	public void popMin(int data){
		if(isEmpty()){
			throw new NoSuchElementException("Stack Underflow");
		}
		if(data == top.getData()) {
			Node ptr = top;
			top = ptr.getLink();
		}
	}
	
	public int topMin(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		return top.getData(); 
	}
	
	public int top(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack Underflow"); 
		}
		return top.getData();
	}
	
	public int sizeOfStack(){
		return size;
	}
	public void display(){
		Node ptr = top;
		if(size == 0){
			System.out.println("Stack is empty");
			return;
		}
		while(ptr !=null){
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getLink();
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedStack ls = new LinkedStack();
		LinkedStack lsMin = new LinkedStack(); // stack to maintain minimum element
		char ch;
		do{
			System.out.println("Stack");
			System.out.println("1. Push Data in stack");
			System.out.println("2. Pop Data from stack");
			System.out.println("3. Top of the stack(peek)");
			System.out.println("4. Size");
			System.out.println("5. Check Empty");
			System.out.println("6: Min element"); // stack with min operation
			int input = sc.nextInt();
			switch(input){
			case 1: {
				System.out.println("Enter integer to push");
				int data = sc.nextInt();
				ls.push(data);
				lsMin.pushMin(data);
				break;
			}
			case 2:{
				try{
					int data = ls.pop();
					System.out.println( data + " is popped");
					lsMin.popMin(data);
				}
				catch(Exception e){
					System.out.println("Error: " + e.getMessage());
				}
				break;
			}
			
			case 3:{
				try{
					System.out.println("Top of the stack is " + ls.top());
				}catch(Exception e){
					System.out.println("Error: " + e.getMessage());
				}
				break;
			}
			case 4:{
				System.out.println("size of stack is " + ls.sizeOfStack());
				break;
			}
			
			case 5:{
				if(ls.isEmpty())
					System.out.println("Stack is empty");
				else{
					System.out.println("Stack is not empty");
				}
				break;
			}
			case 6:{
				System.out.println("Min Element is " + lsMin.topMin());
			}
			
			}
			ls.display();
			System.out.println("Do you want to continue (Y or N)");
			ch = sc.next().charAt(0);	
		}while (ch == 'Y' || ch == 'y');
		
		
	}
	
	
	
}
