package datastructures;

public class Node {
	private int data;
	private Node link;
	
	
	
	public Node(int data,Node l){
		this.data = data;
		this.link = l;
	}
	
	public int getData(){
		return this.data;
	}
	
	public Node getLink(){
		return this.link;
	}
	
	public void setLink(Node l){
		this.link = l;
	}
}
