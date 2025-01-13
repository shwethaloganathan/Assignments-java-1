package assignments_1to10;

public class Assignment_1 {

	public static void main(String[] args) {
		//Write a programs to find larger value
		double c =3657651.7676;
		double b =3456.76;
		double a =3.7676;
		
		if (a > c && a > b) {
			System.out.println("A is large value");
	
		}
		else if (b > c && b > a) {
		    System.out.println("B is large value");	
		}
		else if (c > b && c > a) {
		    System.out.println("C is large value");	
		}
		else if (b == a && b != c) {
		    System.out.println("B and A both are equal");	
		}
		else if (c == a && b != a) {
		    System.out.println("C and A both are equal");	
		}
		else if (b == c && b != a) {
		    System.out.println("B and C both are equal");	
		}
		
		else {
			System.out.println("A, B and C all are equal");

		} 
		


	}

}
