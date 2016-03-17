package linklist;

/*
 * 
 * 
 * 2.2 Implement an algorithm to find the nth to last element of a singly linked list.
 * 
 * 
 */

public class LinkList {
	Node start;
	Node end;
	
	
	public LinkList(){
		start = null;
		end = null;
	}
	
	
	public void inserData(int data){
		Node node = new Node(data,null);
		if(start == null){
			start = node;
			end = start;
		}
			
		
		else{
			end.setLink(node);
			end = node;
		}
	}
	
	// find the nth to last link
	
	public Node nthToLast(int n){
		Node p1 = start;
		Node p2 = start;
		if(start == null || n < 1){
			return null;
		}
		
		for(int i=0; i< n-1 ;++i){
			if(p2 == null){
				return null; 
			}
			p2 = p2.getLink();
		}
		while(p2.getLink()!= null){
			p2 = p2.getLink();
			p1 = p1.getLink();	
		}
		return p1;
	}
	
	public void display(){
		Node ptr = start;
		while(ptr.getLink()!= null){
			System.out.print(ptr.getData() + "--> ");
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData());
	}
	
	
	public static void main(String[] args){
		LinkList linkList = new LinkList();
		linkList.inserData(10);
		linkList.inserData(20);
		linkList.inserData(30);
		linkList.inserData(40);
		linkList.inserData(50);
		linkList.inserData(60);
		linkList.display();
		Node n = linkList.nthToLast(2); // nth to last element in link list
		System.out.println(n.getData());
	}
}
