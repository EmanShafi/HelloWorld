import java.util.Scanner; // import the Scanner class 
public class Reviewpractice {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
				 int condition, choice;
	    

	        System.out.println("Enter 0 to view menu option:");
			Double x = scan.nextDouble();

		if (x==0) {

	      System.out.println("/........... String Operations Menu................/");
	      System.out.println("Press 1 for palindrom check");
	      System.out.println("Press 2 to reverse a string");
	      System.out.println("Press 3 to concatenate two strings");
	      System.out.println("Press 4 for string comparison");
	      System.out.println("Press 5 to find length of string ");

	      choice = scan.nextInt();		
				
				
				
	   // System.out.println("Enter username here: ");
	   // String userName = myObj.nextLine();
	    
	    //System.out.println("Enter the name of your pet: ");
	    //String pet = myObj.nextLine();
	    
	    //System.out.println("Enter age: ");
	    //int age = myObj.nextInt();
	    
	    //System.out.println("Thank you for submitting your information!");
	    //String goodBye = myObj.nextLine();
	    
	    
	    if (choice == 3) {
	    	
	    	
	    	
	    	String firstStr = scan.nextLine();
	    	System.out.println("Enter first string: ");
	    	
	    	
	    	
	    	System.out.println("Enter second string: ");
	    	
	    	String secondStr = scan.nextLine();
	    	
	    			 
	    	String concat = firstStr + " " + secondStr;	 
	    	
	    
	    	System.out.println("Concatenated string is: " + concat);
	    	 
	    	
	    	System.out.println("To continue calculation Press 1 else Press any button to exit");
	    	
	    	//int num = scan.nextInt();
	       // if (num !=1) {
	    }
	    
		}
	}
}
	




		//String userName = "Enter username: ";
	    //String userInput = nextLine();