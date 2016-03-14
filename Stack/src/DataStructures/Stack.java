package DataStructures;
import java.util.Scanner;
public class Stack{
	private int[] stack;
	private int top;
	public int size;
	public Stack(int size){
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	public void push(int data){
		if(top == this.size-1){
			System.out.println("Stack is full");
		}
		else{
			top = top +1;
			this.stack[top] = data;
			
		}
		
	}
	
	public void pop(){
			
			if(this.top > -1){
				top = top -1;
			}
			
	}
	
	public int getTopElement(){
		return this.stack[top];
	}
	
	public int getTop(){
		return this.top;
	}
	
	
	
	public void display(){
		for(int i= top; i >=0;i--){
			System.out.print(stack[i] + "\t");
		}
		if(this.top == -1){
			System.out.println("Stack is empty");
		}
		System.out.println();
		System.out.println();
	}
		
}











