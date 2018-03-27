package pets;

public class PetDomination {

	public static void main(String[] args) {
		
		int people = 2, cats =4, dogs =5;
		
		//is are there too many cats in the world? 
		if(people < cats) {
			
			System.out.println("Too many cats! The world is doomed!");		
		}
		if(people > cats) {
			
			System.out.println("Too few cats! The world is saved for another day!");		
		}
		
		
		// are there too many dogs in the world?
		if(people < dogs) {
			
			System.out.println("The world is drooled on!");	
			
		}
		if (people > dogs ) {
			
			System.out.println("The world is dry!");	
			
		}
		
	}
	
	
	
}
