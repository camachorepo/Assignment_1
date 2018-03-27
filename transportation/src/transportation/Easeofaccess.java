package transportation;

public class Easeofaccess {

	public static void main(String[] args) {
		int people = 10, cars = 40, buses = 200; 
		
		// the else if and else statements below are trying to figure out the best mode of transportation
		if (people < cars) {
			
			System.out.println("We should take the cars");
		}
		else if (people > cars) {
			
			System.out.println("We should not take the cars.");
		}
		else {
			
			System.out.println("We can't decide");
		}
		
		
		if (buses > cars) {
			
			System.out.println("That's too many buses.");
		}
		else if (buses < cars) {
			
			System.out.println("Maybe we should take the buses.");
		}
		else {
			
			System.out.println("We still can't decide");
			
		}
		
		if(people > buses) {
			System.out.println("Alright, lets just take the buses");
			
		}
		else {
			
			System.out.println("Let's just take the cars.");
		}
		
		
	}
	
	
}
