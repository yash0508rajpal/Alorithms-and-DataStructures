package stack;

import java.util.NoSuchElementException;
import java.util.Scanner;

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
		char ch;
		do{
			System.out.println("Stack");
			System.out.println("1. Push Data in stack");
			System.out.println("2. Pop Data from stack");
			System.out.println("3. Top of the stack(peek)");
			System.out.println("4. Size");
			System.out.println("5. Check Empty");
			int input = sc.nextInt();
			switch(input){
			case 1: {
				System.out.println("Enter integer to push");
				ls.push(sc.nextInt());
				break;
			}
			case 2:{
				try{
					System.out.println(ls.pop() + " is popped");
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
			
			}
			ls.display();
			System.out.println("Do you want to continue (Y or N)");
			ch = sc.next().charAt(0);	
		}while (ch == 'Y' || ch == 'y');
		
		
	}
	
	
	
}
