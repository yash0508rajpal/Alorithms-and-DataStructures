package queue;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingStack<T> {
	Stack<T> s1;
	Stack<T> s2;
	
	
	public QueueUsingStack(){
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	
	public void insert(T data){
		
		if(s1.size()==0){
			s1.push(data);
		}
		else{
			int l = s1.size();
			for(int i=0;i < l;i++){
				s2.push(s1.pop());
			}
			s1.push(data);
			for(int i=0;i < l;i++){
				s1.push(s2.pop());
			}
		}
	}
	
	
	public T remove(){
		if(s1.isEmpty()){
			throw new NoSuchElementException("UnderFlow Exception");
		}
		return s1.pop();
	}
	
	public T peek(){
		if(s1.isEmpty()){
			throw new NoSuchElementException("Queue is empty");
		}
		return s1.peek();
	}
	
	public int getSize(){
		return s1.size();
	}
	
	public boolean isEmpty(){
		return s1.isEmpty();
	}
	public void display(){
		for(int i= s1.size()-1;i>=0;i--){
			System.out.print(s1.get(i)+ " ");
		}
		System.out.println();
	}
	
}
