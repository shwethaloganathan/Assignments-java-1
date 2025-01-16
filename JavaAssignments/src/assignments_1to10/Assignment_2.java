package assignments_1to10;

public class Assignment_2 {

	public static void main(String[] args) {
	
	    //age under  0 to 2 years, you have to print "Infant" into Console
		//age under  2 to 12 years, you have to print "Child" into Console
		//age under  12 to 25 years, you have to print "Young" into Console
		//age under  25 to 59 years, you have to print "Adult" into Console
		//age under  59 to 100 years, you have to print "Sr.Citizen" into Console
		//if more than 100 years, system should display "invalid age"

		int age = 0;
		
		if (age <= 2) {
			System.out.println("Infant");
		}
		if (age > 2 && age <= 12) {
			System.out.println("Child");
		}
		if (age > 12 && age <= 25) {
			System.out.println("Young");
		}
		if (age > 25 && age <= 59) {
			System.out.println("Adult");
		}
	        if (age >= 58 && age <= 100) {
			System.out.println("Sr.Citizen");
		}
		if (age > 100) {
			System.out.println("Invalid age");
		}
		
		
		
			
		

	}

}
