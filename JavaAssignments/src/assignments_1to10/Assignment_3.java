package assignments_1to10;


public class Assignment_3 {

	public static void main(String[] args) {
	
		//String a = "Hi all";
		//String b = "CoreJava";
		//i.find the length of both the Strings
		//ii. find the 5th charecter based on index from b string
		//iii. check both the Strings are equals or not?
		//iv. convert a string to uppercase and b String to lowercase
		//v. String c = "Selenium is web-based Automation Tool.";
		  // 1) Verify Automation word is displayed or not?
		   //2) Check Selenium word is contains  or not?
		   //3) Print only web word from the above String.

		String a = "Hi all";
		String b = "CoreJava";
		
		//i.find the length of both the Strings
	
		System.out.println(a.length());
		System.out.println(b.length());
		
		//ii. find the 5th charecter based on index from b string
		
		System.out.println(b.charAt(5));
		
		//iii. check both the Strings are equals or not?
		
		if(a.equals(b)) {
			System.out.println("Both the strings are equal");
		} else {
			System.out.println("Both the strings are not equal");
		}
		
		
		//iv. convert a string to uppercase and b String to lowercase
		
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		//v. String c = "Selenium is web-based Automation Tool.";
		// 1) Verify Automation word is displayed or not?
		   //2) Check Selenium word is contains  or not?
		   //3) Print only web word from the above String.

		
		
		
		
		}

	}


