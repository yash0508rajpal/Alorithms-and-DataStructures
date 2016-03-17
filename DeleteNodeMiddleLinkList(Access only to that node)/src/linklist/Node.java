package linklist;

public class Node {
	int data;
	Node link;
	
	public Node(int d, Node l){
		this.data = d;
		this.link = l;
	}
	
	
	public Node getLink(){
		return this.link;
	}
	
	public void setLink(Node l){
		this.link = l;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		this.data = data;
	}
}

