import java.util.Scanner;

public class DayTranslation {
	
	public static void main(String[] args) {
		int day =0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Hey please give a integer for the current day in the week 1-7: ");
		day= reader.nextInt();
		
		if (day == 1) {
			
			System.out.println("The day is Monday!");
		}
		else if (day == 2) {
			
			System.out.println("The day is Tuesday!");
		}
		else if (day == 3) {
			
			System.out.println("The day is Wednesday!");
		}
		else if (day == 4) {
			
			System.out.println("The day is Thursday!");
		}
		else if (day == 5) {
			
			System.out.println("The day is Friday!");
		}
		else if (day == 6) {
			
			System.out.println("The day is Saturday!");
		}
		else if (day == 7) {
			
			System.out.println("The day is Sunday!");
		}
		else {
			System.out.println("Wrong value recieved for Day. Value must be between 1 and 7");
		}
	}

}
