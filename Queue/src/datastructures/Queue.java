package datastructures;

public class Queue{
	private Node start;
	private Node end;
	private int size;
	
	public Queue(){
		this.size = 0;
		start = null;
		end = null;
	}
	
	
	public void enqueue(int data){
		Node nptr = new Node(data,null);
		size++;
		if(start == null){
			start = nptr;
			end = start;
		}
		else{
			end.setLink(nptr);
			end = nptr;
		}
	}
	
	public int getSize(){
		return this.size;
	}
	
	public int dequeue(){
		Node temp = start.getLink();
		int data = start.getData();
		start = temp;
		size --;
		return data;
	}
	
	public int front(){
		return start.getData();
		
	}
	
	public int end(){
		return end.getData();
	}
	
	public void display(){
		if(size == 0){
			System.out.println("queue is empty");
			return;
		}
		if(start.getLink() == null){
			System.out.println(start.getData());
			return;
		}
		Node ptr = start;
		while(ptr.getLink()!= null){
			System.out.print(ptr.getData() + "\t");
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData());
	}
	
	
}