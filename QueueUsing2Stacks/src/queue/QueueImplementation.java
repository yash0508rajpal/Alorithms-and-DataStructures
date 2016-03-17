/*
 * 
 * 
 * Queue with 2 stacks 
 */


package queue;
import java.util.Scanner;

public class QueueImplementation {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		QueueUsingStack<Integer> stack = new QueueUsingStack<Integer>();
		
		char ch;
		do{
			System.out.println("Queue");
			System.out.println("1: Queue");
			System.out.println("2: Dequeue");
			System.out.println("3: Peek");
			System.out.println("4: Empty status");
			System.out.println("5: size of queue");
			int input = sc.nextInt();
			switch(input){
			case 1:{
				System.out.println("Enter data to Queue");
				stack.insert(sc.nextInt());
				break;
			}
			case 2:{
				try{
					System.out.println(stack.remove() + " is dequeued");
					break;
				}catch(Exception e){
					System.out.println("Error:" +e.getMessage());
				}
				break;
			}
			case 3:{
				try{
					System.out.println(stack.peek());
				}catch(Exception e){
					System.out.println("Error:" + e.getMessage());
				}
				break;
			}
			case 4:{
				System.out.println("Empty Status:"+ stack.isEmpty());
				break;
			}
			case 5:{
				System.out.println("Size of Queue: "+ stack.getSize());
			}
			}
			stack.display();
			System.out.println("Do you want to Continue(Y or y)");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}
