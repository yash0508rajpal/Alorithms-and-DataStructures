/*
 * 
 * 
 * 
 * 2.4 You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1’s digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
EXAMPLE
Input: (3 -> 1 -> 5), (5 -> 9 -> 2)
Output: 8 -> 0 -> 8
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
	
	
	public void sum(LinkList newLink,LinkList l1,LinkList l2){
		int carry = 0;
		int sum = 0;
		Node ptr1 = l1.start;
		Node ptr2 = l2.start;
		if(ptr1 == null && ptr2 == null)
		return;
		while(ptr1 != null || ptr2 != null){
			sum = 0;
			if(ptr1 != null && ptr2 != null){
				sum = ptr1.getData() + ptr2.getData() + carry;
				if(sum > 9){
					newLink.inserData(sum%10);
					carry = sum/10;	
				}
				else{
					newLink.inserData(sum);	
				}
			}
			else if( ptr1 !=null){
				sum = ptr1.getData(); 
				newLink.inserData(sum);
			}
			else{
				sum = ptr2.getData();
				newLink.inserData(sum); 
			} 
			ptr1 = ptr1.getLink();
			ptr2 = ptr2.getLink();
		}
		
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
		LinkList linkList1 = new LinkList();
		LinkList linkList2 = new LinkList();
		linkList1.inserData(1);
		linkList1.inserData(2);
		linkList1.inserData(3);
		/*linkList2.inserData(4);
		linkList2.inserData(5);
		linkList2.inserData(6);*/
		LinkList linkList3 = new LinkList();
		linkList3.sum(linkList3,linkList1,linkList2);
		linkList3.display();
		
		
	}
}
