package DataStructure;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		LinkList linkList = new LinkList();
		while(true){
			System.out.println("1:Insert at Begining of Linklist");
			System.out.println("2:Insert at end of Linklist");
			System.out.println("3:Insert at a position of Linklist");
			System.out.println("4:Delete at a position of Linklist");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			switch(input){
			case 1: {
				System.out.println("Enter data to insert");
				int data = sc.nextInt();
				linkList.insertAtBegining(data);
				linkList.display();
				break;
			}
			
			case 2:{
				System.out.println("Enter data to insert");
				int data = sc.nextInt();
				linkList.insertAtEnd(data);
				linkList.display();
				break;
			}
			
			case 3:{
				
				System.out.println("Size of Link List is " + linkList.sizeOfLinkList());
				System.out.println("Enter position to insert");
				int pos = sc.nextInt();
				System.out.println("Enter data to insert");
				int data = sc.nextInt();
				linkList.insertAtPostion(data,pos);
				linkList.display();
				break;
				
			}
			
			case 4:{
				System.out.println("Size of Link List is " + linkList.sizeOfLinkList());
				System.out.println("Enter position to delete");
				int pos = sc.nextInt();
				linkList.deleteAtPosition(pos);
				linkList.display();
				break;
			}
			}
		}
		
	}
	
	
}
