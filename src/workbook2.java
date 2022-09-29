
public class workbook2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// you can use comparison operators in these conditional statments.
				// you should leave an indentation command shift f (helps align your code in the main method all you have to do is highlight it.. 
		int a = 8;
		int b = 5;
		
		//Nested conditional/ Nested If Statements
		int c = 3;
		
		if ( a > b) {
			
			if (a < c) {
				System.out.println( a + " is bigger than " + c);
			} else {
				System.out.println( a + " is smaller than " + c);
			}
		} else {
			System.out.println( a + " is  smaller than " + b);
		}
		//  if there is one false statement anything in the nested block will not be run. the entire thing is dependent on the first if statment.		
				
		if (a > b) {
			System.out.println( a + " is bigger than " + b);
		}
		int a1 = 3;
		int b1 = 3;
		
		if (a1 > b1) {
			System.out.println( a1 + " is bigger than " + b1); // this will not print any value
		
		} else if ( a1 < b1 ) {
			System.out.println( a1 + " is less than b " + b1);
		}
		else {
			System.out.println( a1 + " is equal to " + b1);
			}
			//if condition evaluates false we can add an else statement to execute something when the statement is false.
		
		//make sure you know the technical terms! will the "if block" execute or the "else block execute.
		// if the int a1 = 3 and int a2 = 3 then the first if block won't run but the else block will becuase you told the computer if a is not bigger then b then run else.
		// else if is not interchangeable with else. Else has to be the last one in the process and else if are to add more conditions.
		//need to include conditional statements cause you don't know what kind of values are going to be inputted the values can change. so need to cover all your bases.
		//java will execute in a sequence so even if there are two conditions that are met java will only print the first true value.
		// its not good practice to have too many else if statments. maximum 3 conditions to evaluate. if too many else if statments might need to consider using a different solution to the approach.
	}
		
		
	}


