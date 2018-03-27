import java.util.Scanner;

public class problems {

	
	public static void main (String [] args) {
		int age;
		String name;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Hello please provide you name:");
		name = reader.nextLine();
		
		System.out.print("Hey what is your age?");
		age = reader.nextInt();
		
		if(age < 16) {
			System.out.println(name + " You can't drive");
			
		}
		else if (age < 18 ) {
			
			System.out.println(name + " You can't vote");
		}
		else if (age < 25) {
			System.out.println(name + " You can't rent a car");
		
		}
		else  {
			System.out.println(name + " You can do anything that's legal");
			
		}
		
	}
}
