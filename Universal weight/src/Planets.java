import java.util.Scanner;

public class Planets {
	
	public static void main (String[] args) {
		double weight =0.0; 
		int planet;
		Scanner reader = new Scanner(System.in);
		boolean valid = false;
		System.out.println("What is your Earth Weight: ");
		weight = reader.nextDouble();
		
		
		System.out.println("State a planet you'd like to know your weight on with integer 1-6");
		
		System.out.println("1. (Venus)");
		System.out.println("2. (Mars)");
		System.out.println("3. (Jupiter)");
		System.out.println("4. (Saturn)");
		System.out.println("5. (Uranus)");
		System.out.println("6. (Neptune)");
		
		System.out.println("Which planet will you be traveling to?");
		planet = reader.nextInt();
		
		if (planet == 1) {
			weight = weight * .78;
			valid = true;
		}
		else if (planet == 2){
			weight = weight * .39;
			valid = true;
		}
		else if (planet == 3){
			weight = weight * 2.65;
			valid = true;
		}
		else if (planet == 4){
			weight = weight * 1.17;
			valid = true;
		}
		else if (planet == 5){
			weight = weight * 1.05;
			valid = true;
		}
		else if (planet == 6){
			weight = weight * 1.23;
			valid = true;
		}
		

		if (valid) {
			System.out.println("Your weight would be : " + weight + " LBS on the that planet");
		}
		else 
		{
			System.out.println("You entered in an invalid planet value must be between 1 and 7");
		}
	}
		

}
