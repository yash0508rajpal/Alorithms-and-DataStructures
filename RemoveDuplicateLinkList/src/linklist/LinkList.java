package linklist;

import java.util.HashSet;

// Remove duplicates from Linklist 
public class LinkList {
	Node start,end;
	
	public LinkList(){
		start = null;
		end = null;
	}
	
	// insert data in linklist (at the end)
	public void insertData(int d){
		Node node = new Node(d,null);
		if(start == null){
			start = node;
			end = start;
		}
		else{
			end.setLink(node);
			end = node;
		}
	}
	
	public void removeDuplicates(){ // Method to remove duplicates from an unsorted linklist
		if(start == null)
			return;
		
		Node prev = start;
		Node current = prev.getLink();
		while(current != null){
			Node foreRunner = start;
			while(foreRunner != current){
				if(foreRunner.getData() == current.getData()){
					prev.setLink(current.getLink());
					current = current.getLink();
					break;
				}
				foreRunner = foreRunner.getLink();
			}
			if(foreRunner == current){
				prev = current;
				current = current.getLink();
			}
		}
	}
	
	public void removeDuplicatesHashMap(){
		HashSet<Integer> table = new HashSet<Integer>();
		if(start == null){
			return;
		}
		Node prev = start;
		Node current = start;
		while(current!= null){
			if(table.contains(current.getData())){
				prev.setLink(current.getLink());
			}
			else{
				table.add(current.getData());
				prev = current;
			}
			current = current.getLink();
		}
	}
	
	public void printLinkList(){
		Node ptr = start;
		while(ptr.getLink()!=null){
			System.out.print(ptr.getData() + "-->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData());
	}
	
	
	public static void main(String[] args){
		LinkList linkList = new LinkList();
		linkList.insertData(10);
		linkList.insertData(20);
		linkList.insertData(40);
		linkList.insertData(10);
		linkList.insertData(10);
		linkList.insertData(20);
		linkList.insertData(40);
		linkList.insertData(10);
		linkList.insertData(10);
		linkList.insertData(20);
		linkList.insertData(40);
		linkList.insertData(10);
		linkList.printLinkList();
		linkList.removeDuplicates(); // without using buffer
		//linkList.removeDuplicatesHashMap(); // using hashSet
		System.out.println();
		linkList.printLinkList();
		
	}
	
}
