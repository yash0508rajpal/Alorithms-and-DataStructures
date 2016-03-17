/*
 * 
 * 
 * 
 * 2.3 Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
 * 
 * 
 * 
 * 
 */

package linklist;

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
	
	public void deleteNode(){
		// Delete node in between but cannot delete in the last
		Node ptr = start;
		int n = 3; // delete 3rd node
		for(int i=0; i < n-1;i++){
			// delete 3rd node only access to second node
			ptr = ptr.getLink();
		}
		/*Actual code here */
		Node next = ptr.getLink();
		ptr.setData(next.getData());
		ptr.setLink(next.getLink());
		
		
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
		System.out.println("After Deletion");
		linkList.deleteNode();
		linkList.display();
		
		
	}
}
