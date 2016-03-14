package datastructures;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		/*System.out.println("Enter size of queue");*/
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue();
		while(true){
			System.out.println("1: Enqueue");
			System.out.println("2: Dequeue");
			System.out.println("3: Front");
			System.out.println("4: End");
			int input = sc.nextInt();
			switch(input){
			case 1:{
					System.out.println("Enter number to Enqueue");
					int data = sc.nextInt();
					q.enqueue(data);
					q.display();
					break;
			}
			
			case 2:{
				if(q.getSize() != 0){
					int data = q.dequeue();
					System.out.println( data +" is dequed");
					q.display();
				}
				else{
					q.display();
				}
				break;
			}
			
			case 3:{
				System.out.println("Front is " + q.front());
				break;
			}
			
			case 4:{
				System.out.println("End of the queue is " + q.end());
				break;
			}
			}
		}
	}
}
