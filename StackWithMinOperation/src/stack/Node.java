package stack;

public class Node {
	private int data;
	Node link;
	
	
	public Node(int data,Node l){
		this.data = data;
		this.link = l;
	}
	
	
	public Node getLink(){
		return this.link;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setLink(Node l){
		this.link =l;
	}
	
	public void setData(int data){
		this.data = data;
	}
}
