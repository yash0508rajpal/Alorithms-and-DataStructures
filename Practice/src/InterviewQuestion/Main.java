package InterviewQuestion;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Person[] persons = new Person[num];
		for(int i=0;i < num;i++){
			int age = sc.nextInt();
			double height = sc.nextDouble();
			if(age == 7){
				persons[i] = new Person(height,PersonType.SevenYrsOld);
			}
			else if(age ==8){
				persons[i] = new Person(height,PersonType.EightYrsOld);
			}
			else{
				persons[i] = new Person(height,PersonType.Teacher);
			}
		}
		System.out.println("Understood");
		//Person.noOfSwaps(persons);
		
	}
}
