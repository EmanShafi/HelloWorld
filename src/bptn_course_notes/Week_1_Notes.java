package bptn_course_notes;

public class Week_1_Notes {
	//Every file in Java must be inside a class and in this example our class name is Practice.
	//Must begin with an uppercase first letter
	//Also note that java is case sensitive "MyClass" and "myclass" has different meaning
	//Name of the file must match the class name. When saving the file use class name (Practice) and add ".java" at the end

	public static void main(String[] args) {
		//Every java file must contain the main method ie. main()
		System.out.println("Hello World");
		//println method is used to print the line of code to the screen
		//every line of code should end in a semicolon (;)
		//we do not use "" when outputting numbers eg. below
		System.out.println(3 + 3);

		//print method is similar to println except it does not add a new line eg. below
		System.out.print("Hello World");
		System.out.println("My name is Eman");
		//Important to note that you need to put a println for the last code you want to have on the same line or else the following codes will be attached to the same line.
		//Important note because the print function prints the codes on the same line need to manually include a space between hello world and ". eg. below
		System.out.print("Hello World ");
		System.out.println("My name is Eman");
		// The two forward slashes are used for short one line comments 
		/* is used for longer multi-line comments */
		/* Java uses variables which are containers for storing data values.
		 * There a different types of variables:
		 * String- which stores text, such as "Hello" string values are surrounded by double quotations ""
		 * int- Stores integers or whole numbers without decimals. eg: 123 or -123
		 * float- stores floating point numbers with decimals. eg: 19.99 or -19.99 less than 7 decimal places
		 * double- Same as float, deals with decimals. but larger then 7 decimal places. eg: 8.987827485
		 * char- Stoes single characters surrounded by single quotations ''. eg: 'a' or 'k'
		 * boolean- stores values with two states. eg: true and false or yes and no 
		 */
		// Need to declare/create variables. To declare variable must specify the type and assign it a value.
		// type variableName = value;
		
		// type is either (Sting, int, char etc.)
		// variableName is whatever you assign as a name
		// MAKE NOTE: variable name always starts with a lower case! See below for example. variable name= carName
		String carName = "Volvo";
		System.out.println(carName);
		// Known as camelCase? first letter of first word is lowercase and first letter of second word is Capitalized since they don't have space between words makes it easier to read.
		// the equal sign (=) is used to assign values to the variable.
		// create a variable called name of type String and assign it the value Eman
		
		String name = "Eman";
		System.out.println(name);
		//note that you should not put quotations around the name when you are printing the code it does not match the variable name you gave it
		
		int number = 22;
		System.out.println(number);
		//note no quotations around the number 22 because it is an integer. 
		// you can also declare a variable without assigning the value and assign the value later. see below
		int numb;
		numb = 15; 
		System.out.println(numb);
		// if you assign a new value to numb then it will override the previous value assigned.
		numb = 40;
		System.out.println(numb);
		//if you don't want other to override or change the values or overwrite existing values use the final keyword. which will declare the variable as constant/final.
		//at this point if I try to change numb value to anything else i will get an error response. 
		
		// you can combine both text and variable see below:
		String firName = "Eman";
		System.out.println("Hello " + firName);
		//note the space between Hello and the " to make the code "Hello Eman" rather then "HelloEman". 
		
		//you can also add a variable to another variable:
		String firstName = "Eman";
		String lastName = "Shafi";
		String fullName = firstName + " " + lastName;
		// I added the space between the two "" so that there would be space between first and last name. Eman Shafi instead of EmanShafi
		System.out.println(fullName);
		
		// for integers the + works as a mathematical operator so it will add the values together. see below:
		int p = 4;
		int f = 8;
		System.out.println(p + f);
		
		//See the example to declare more then one variable of the same type (eg. int):
		int x = 5, y = 6, z = 50;
		System.out.println(x + y + z);
		
		//instead of below:
		int d = 5;
		int s = 6;
		int b = 50;
		System.out.println(d + s + b);
		
		//note we don't put quotations around the letters in the println method code line because they are i

		// you can also assign the same value to multiple variables. see below:
		int a, n, j;
		a = n = j = 10;
		System.out.println(a + n + j);
		
		//NOTE that sometimes you will want to typecast meaning change the variable type.
		//when changing from int--> double it is fine because often adding precision. see example below:
		int numA = 7; 
		double numB = 9.56;
		System.out.println(numA * numB); 
		// console ends up giving us 66.92
		//but when we change from double to int we loose precision and so Java won't let us do so without overriding it and to do so we need to typecast. see below:
		double numC = 7.36;
		int numD = (int)9.56;
		System.out.println(numC * numD);
		//now console ends up giving us 66.24, so it only multiple 7.36 by 9 instead of 9.56. 
		//If there is more then one value then need to put the values in their own bracket as well. see below
		double price1 = 5.3;
		double price2 = 7.5;
		int sumPrice = (int) (price1 + price2);
		System.out.println(sumPrice);
		//console ends up giving us the output of 12 instead of 12.8, so we lost some precision through overriding using typecast.
		
		
		//Notes from Tuesday's Class:
		
		//When you are printing the value of a variable, never put double quotes " " around the variable because that will print out the variable name letter by letter. For example, System.out.println("score"); will print out the string “score”, rather than the value 4 stored in the variable. Normally you do not want to print out the variable name, but the value of the variable in memory. If you’re not sure what this means, try putting quotes around the variables in the print statements above and see what happens.
		 
		
		// System.out.println("<string value here");
	    System.out.println("10/2");
	    //System.out.println(<integer value here>);
	    System.out.println(10/2);
	    
	  //Concatenation
	    //Process of joining two string.
	    //To concatenate we use + operator
	    System.out.println("Riaz Khan");
	    System.out.println("Riaz" + " " + "Khan");
	    
	    System.out.println("Hi "+ name + ", Welcome to Facebook!");
	    System.out.println("Hi "+ "Riaz" + ", Welcome to Facebook!");
	    
	    System.out.println("The output for 10/2 is: " + 10/2);
	    System.out.println("The output for 10/2 is: " + 10/2);
	    // "" => String => It will out as it is (no calculation, no operation)
	    //no quotes => Operation =>
	    // if you have spaces outside string it does not really affect the output
	    // if you have spaces insdie string it will add to the output
	    
	    //For characters we use single quotes
        //For string we use double quotes
        //type variableName = value
        int num1 = 10;
        char firstCharOfYourName = 'K';
        float floatValue = (float)56.2;
        // Make not of how you need to include (float) in brackets beside value because java will think it's an error and want to make it double.
        // Another way instead of writing (float) before the value, you can write "F" right after the value (no space). See below.
        float floValue = 56.2F;
        //System.out.println(variableName);
        System.out.println(num1);
        System.out.println(firstCharOfYourName);
        System.out.println(floatValue);
        System.out.println(floValue);
        
      //Primitive Data Types => Pure Data Types
        //no object, no class, no method, no properties
        //For characters we use single quotes
        //For string we use double quotes
        //type variableName = value
        int num10 = 10;
        char firstCharName = 'K';
        float floatVal = (float)56.2;
        //System.out.println(variableName);
        System.out.println(num10);
        System.out.println(firstCharName);
        System.out.println(floatVal);
        
        int num = 10;
        //dataType = int
        //variableName = num
        //value = 10
        //System.out.println(variableName);
        System.out.println(num);
        
      //Initializing a variable with a value
        int num6 = 10;
        int num7 = 30;
        // num6-> 10, num7-> 30
        //Reinitializing a variable with a different value
        num6 = 20;
        //num6->20 , num7-> 30
        //num8 = 40; this will result into an error as we never defined it
        int sum = num6 + num7; //will store the value of sum (num6&num7)
        // num6-> 20, num7-> 30, sum-> 50
        num7 = 50;
        // num6-> 20, num7-> 50, sum-> 50
        System.out.println(10+20);
        System.out.println(num6+num7);
        System.out.println(sum);
        
        String frName = "Simisola";
        String lasName = "Ajayi";
        String dateOfJoining = "September 2022";
        System.out.println("Hello, My name is Simisola Ajayi. I started this bootcamp in September 2022");
        System.out.println("Hello, My name is " +frName+ " " +lasName + ". I started this bootcamp in " + dateOfJoining);
        
      //WAP to add two numbers
        //Algorithm
        //1. Get first number
        //2. Get second number
        //3. Add two numbers
        //Pseudocode
        // DEFINE firstNumber
        // DEFINE secondNumber
        // DEFINE SUM and ADD firstNumber, secondNumber
        //Program in Java
        //  int fistNumber = 10;
        //  int secondNumber = 5;
        //  int sum = firstNumber + secondNumber;
        
        
        //Continuing w3schools.com note taking!
        //Java Identifiers:
        /* all java variables must be identified with unique names.
         * these unique names are called identifiers.
         * identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume)
         * it is recommended to use more descriptive names in order to create understandable and maintainable code! 
         */
        //Java Data types:
        /* Data types are divided into two categories;
         * 1. primitive data types such as byte, short, int, long, float, double, boolean and char
         * 2. Non-primitive data types- such as String, Arrays and Classes.
         * Primitive data types specialize size and type of variable values but has no other methods.
         * eg: int myNum = 9; float myFloatNum = 8.99f; char myLetter = 'A'; boolean myBool = false; String myText = "Hello";
         * Primitive number types are further divided into two groups: 
         * 1. Integer types: byte, short, int and long. Stores whole number values no decimals
         * 2. Floating point types: float and double. Represents numbers with a fractional part containing one or more decimals.
         * Byte interger type stores whole number from -128 to 127. can be used over int when u know value is within range to save space. 
         * Short integer type can store numbers from -32768 to 32767.
         * int integer is perferred data type when working with numericals stores number from -2147483648 to 2147483647
         * long integer data type store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L"
         * long integer data type eg: long myNum = 15000000000L.
         * Float and doubles store for floating point types and they should also have an f or d after the value.
         * float's percision decimal point are 6-7 while double is 15, therefore safer to use doubles on most calculations.
         * floating point numbers (float and double) can also be a scientific number  with an "e" representing the power of 10. eg: 35e3
         * BOOLEAN integer data type: can take the value of only true or false. Mostly used for conditional testing.
         * CHARACTER integer data type: stores a single character. the character is surrouned by single quotes. eg 'A' or 'c'.
         * you can use ascii values can also be used to declare certain characters. see below for example:
         * char var1 = 65, var2 = 55, var3 = 60;
         * System.out.println(var1); // console will print letters for these three print lines.
         * System.out.println(var2);
         * System.out.println(var3);
         * 
         * STRING non primitive data type: is used to store a sequence of characters. must be surrounded by double quotes.
         * String is integrated and used so much some call it "the special ninth type".
         * Strings has methods that are used to perform certain operations on strings.
         * 
         * Non-Primitive Data types are also known as reference types because they refer to objects. 
         * The main difference between primitive and non-primitive data types are: 
         * Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
         * Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
		 * A primitive type has always a value, while non-primitive types can be null.
	 	 * A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
	 	 * The size of a primitive type depends on the data type, while non-primitive types have all the same size.
	 	 * Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.
         */
        
        /* JAVA TYPE CASTING:
         * type casting is when you assign a value of one primitive data type to another type.
         * in java there are two types of casting: 1.widening casting which happens automatically and 2. narrowing casting which happens manually.
         * Widening casting= byte-> short-> char-> int-> long-> float-> double.
         * Narrowing casting= double-> float-> long-> int-> char-> short-> byte.
         */ 
        //Widening example:
         int myInt = 5;
         double myDouble = myInt;
         System.out.println(myInt);
         System.out.println(myDouble);
         
         //Narrowing example:
         double myDouble1 = 9.38;
         int myInt1 = (int) myDouble1;
         System.out.println(myDouble1); //outputs 9.78
         System.out.println(myInt1); // outputs 9
        
         /* JAVA OPERATORS:
          * 1. Arithmetic operators: + addition (x + y), - subtraction (x - y), multiplication (x * y), / division (x / y), % Modulus (x % y), ++ increment by 1 (++x), -- decrement by 1 (--x).
          * Arithmetic (math) operators only work for data types int, double, and float.
          * 2. Assignment operators: = assigns value (x = 6), += addition assignment (x+= 3; x=x+3 ; 6, same for other operators.. (I don't understand &=, |=, ^=, >>=, <<=)
          * 3. Comparison operators: == equal to ( x == Y), != not equal (x != y), > Greater than (x > y), Less than (x < y), >= Greater than or equal to (x >= y), <= Less than or equal to ( x <= y).
          * 4. Logical operators; && and returns true if both statements are true (x < 5 && x < 10), || or returns true if one of the statements is true. ! not reverse the result, returns false if the result is true. 
          */ int m = 5;
             System.out.println(!(m > 3 && m < 10));
          /* Bitewise operators:
           * OR | operator: returns a returns a 1 if either of the bits are a 1, if there are no ones returns a 0. example below:
           * a = 5 = 0101 (in Binary)  
           * b = 7 = 0111 (in Binary)
           *         0111 = 7.0 // returns values in decimal
           * AND & operator: returns a 1 if both bits are 1, if not both 1's then returns a 0. example continued:
           *         0101 = 5.0
           * XOR ^ operator: returns a 1 if bits are different, if bits are the same returns a 0. example continued below:
           *         0010 = 2.0     
           * Complement/Unary ~ operator:  it inverts the bits of one input. so it returns the oppisite. see below for example:
           * a = 5 = 0101
           *         1010 = 10.0 // i don't really understand this one but basically ~x == (-x) -1 . So -5 - 1= -6 is the answer. or if x= -5 then (when plugging into formula becomes positive 5) 5-1 = 4 so complementary is 4.
           *  // Note for the above complementary operator stick to the formula to help you. 
           * >> right shift operator: a = 5 = 0101
           * 						  a = >> 2
           *  becomes 01 (because the last 01 gets shifted out. therefore output is  1.0 in the console.
           *  << left shift operator: a = 5 = 0101
           *  						  a = << 3 
           *  becomes 0101000 (because add three 0's to the end) therefore output is 40.0 in the console.
           */
          
 // Need to learn about the unsigned operator. have no clue what that is. 
             
         /* JAVA STRINGS:
		          * Strings are used for storing text. A string variable contains a collection of characters surrounded by double quotes:
		          
		          	* String Length:
		          	* The length of a string can be found with the length() method.
		          	* There are many string methods available. toUpperCase() and toLowerCase().
		          
		          	* Finding a Character in a String:
		          	* use the indexOf() method which returns the position and first occurrence of a specified text in a string (including whitespace). 
		          	*/
		           String txt = "Please locate where locate occurs!";
		           System.out.println(txt.indexOf("locate")); // outputs 7
		           
		           
		          /* String Concatenation:
		           * + operator can be used to combine strings this is called concatenation.
		           */ 
		           
		           String firstName1 = "John";
		           String lastName1 = "Doe";
		           System.out.println(firstName1 + " " + lastName1);
		           //note we added an empty space between firstName and lastName " ".
		           System.out.println(firstName1.concat(lastName1));
		           
		         /* Java Numbers and Strings:
		          * int h = 15;
		          * int o = 20;
		          * int q = h + o; //will print 35
		          * String u = "10";
		          * String f = "5"; //don't forget the double quotation marks around the values for strings. 
		          * String n = u + f; //will print 105 because for string the + operator does not add the number together. 
		          * Adding a string and a number will result in a string concatenation .
		          * String U = "10";
		          * int F = 5;
		          * String N = U + F; // will print 105 again.
		          */
		           
		          /* Special Characters:
		           * the backslash escape character \ turns special characters into string characters:
		           * \' will result in a single quote '
		           * \" will result in a double quote "
		           * \\ will result in a backslash.
		           */
		           String sentence = "We are the so-called \"Vikings\" from the north.";
		           System.out.println(sentence);
		           String sentence1 = "It\'s alright";
		           System.out.println(sentence1);
		           String sentence2 = "The character \\ is called backslash";
		           System.out.println(sentence2);
		           /* other common escape sequence 
		            * \n = new line
		            * \r = carriage return
		            * \t = tab    //search up all of these ones.
		            * \b = backspace
		            * \f = formfeed
		            */
		           
          /* JAVA MATH: 
           * has many methods allowing us to perform mathematical tasks on numbers. 
           * Math.max(x,y) method can be used to find the highest value of x and y:
           * eg: Math.max(5, 10);
           * Math.min(x, y) method can be used to find lowest value of x and y:
           * eg: Math.min(5, 10);
           * Math.sqrt(x) method returns the square root of x:
           * eg: Math.sqrt(64); //output will be 8.
           * Math.abs(x) method returns the absolute positive value of x:
           * eg: Math.abs(-4.7); // output will be 4.7.
           * Math.random() returns random number between 0.0 (inclusive) and 1.0 (exclusive):
           * to get more control over the random number between 0 and 100, you can use the following formula. 
           */ 
		     int randomNum = (int)(Math.random() * 101);
             System.out.println(randomNum);
           
           
           /* JAVA BOOLEANS:
            *  data type that can only have one of two values, like: YES/NO, ON/OFF, TRUE/FALSE
            *  boolean data type can take values true or false.
            */ 
             boolean isJavaFun = true;
             boolean isFishTasty = false;
             System.out.println(isJavaFun); // outputs true value
             System.out.println(isFishTasty); // outputs false value
             
             		/* Boolean Expression:
             		 * a JAvA expression that resturns a boolean value : true or false.
             		 * you can use comparison operator like greater than > to find out if an expression (or a variable) is true.
             		 */
                      int h = 10;
             		  int c = 9;
             		  System.out.println(h>c);
             		// can write it either way. 
             		  System.out.println(10>9);
             		 // another example is below:
             		  int g = 7; // one equal sign tells us we are assigning a value.
             		  System.out.println(g == 7); // two equal signs means equal to or equivalent to.
             		// another example
             		  System.out.println(2==9); // output false.
             		  
             
          /* JAVA IF...ELSE:
           * Java conditions and If statements: You can use logical conditions from mathematics ( <, >, <=, ==, !=) to perform different actions for different decisions. 
           * if: use to specify a block of code to be executed if a specified condition is true. 
           * else: use to specify a block of code if the same condition is false.
           * else if: use to specify a new condition to test if first condition is false. 
           * switch: use to specify many alternative blocks of code to be executed. 
           
           * if (condition) {
           *   // block of code to be execute if the condition is true
           * }
           */  // see below for examples:
            if (20>19) {
            	System.out.println("20 is greater than 19");	
            }
            // can also test variables
            int q = 20;
            int l = 19;
            if (q>l) {
            	System.out.println("q is greater than l");
            }
            
            /* else statement:
             * use the else statement to specify a block of code to be executed if the condition is false.
             * if (condition) { 
             //  block of code to be executed if the condition is true
                } else {
              // block of code to be executed if the condition is false
                }
              */ // se below for example:
            
            int time = 20;
            if (time < 15) { // note no semicolon after if statement. 
            System.out.println("Good day.");
            } else {
            System.out.println ("Good evening."); //outputs good evening.
            }
            
            /* else if statement:
             * use else if statment to specify new condition is the first condition is false.
             * if (conditition1) {
             *  // block of code to be executed if condition1 is true
             *  } else if (condition2) {
             *  // block to be executed if the condion1 is false and condition2 is true.
             *  } else {
             *  // block of code to be executed if the condition1 is false and condition2 is false.
             */
            int time1 = 20;
            if (time1 > 15) {
            	System.out.println("Good morning");
            } else if (time1 < 15) {
            	System.out.println("Good day");
            } else {
            	System.out.println( "Good evening");
            }
            
            //Note if else statements can be shortened using the ternary operator:
            //eg: 
            int Time = 20;
            String result = (Time < 18) ? "Good day." : "Good evening.";
            System.out.println(result); 
            
/* JAVA SWITCH: 
 *  // haven't taken notes for this.  	
 */
          
    /* JAVA WHILE LOOP:
     * the while loop loops through a specific block of code as long as a specified condition is true;
     * while (condition) {
      // code block to be executed 
      }
     */ //example below:
     int I = 0;
     while (I<= 5) {
    	 System.out.println(I);
    	 ++I; // do not forget to increase the variable used in the condition, otherwise loop will never end.	 
     }
     
     /* DO/While Loop:
		      *  the do/while loop is a variant of the while loop. the loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true. 
		      * do {
		      // code block to be executed
		       }
		      while (condition);
		      */
		    // Note the loop will always be executed at least once, even if condition is false, because the code block is executed before the condition is tested.
		     
		     int F = 0;
		     do {
		       System.out.println(F);
		    	 F++;
		     }
		     while (F <= 8); // note this while statement isn't within the do block.
		 
		     
	   /* FOR Loop:
	    * when you know exactly how many times you want to loop through a block of code use for loop instead of while loop.
	     for (statement 1; statement 2; statement 3) {
	    // code block to be executed
	     } 
	    * statement 1 is executed one time before execution of code block.
	    * statement 2 defines the condition for executing the code block.
	    * statement 3 is executed (every time after the code block has been executed.
		* example:
		for (int w = 0; w < 6; w++) {
		System.out.println(w);
		}
		Example : */          
        for (int H = 0; H <= 10; H = H + 2) {
        	System.out.println(H);
        }
        
    // Note for for loops that start i = 0 then use > or < because it will count from 0. but if starting at i = 1 use <= or >= because starts at 1.
    // For example if you want a loop to run 10 times and i = 0; then statement 2 should be i = < 10. (starts counting from 0 and ends at 9, which is to times)
    // but if you start at i = 1; then statement 2 should be i =< 10. because starts counting at 1 so need to include 10 to make it loop 10 tiimes. 
        
        /* FOR-EACH Loop:
         * used exclusively to loop through elements in an array.
         for (type variableName : arrayName) {
         //code of block to be executed
          }
         */
        //Example:
        String[] Cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String K : Cars) {
        	System.out.println(K);
        }
   
        
 /*  JAVA BREAK AND CONTINUE:
  *  //haven't taken notes on this either.     
  */
        
        
   /* JAVA ARRAYS:
    * store multiple values in a single variable.
    * to declare array, define the variable type with square brackets.
    * String[] cars;
    * we have now declared variable that holds array strings. to insert value to it place values in a comma seperated list, inside curly braces.
    * String[] cars = {"Volvo", "BMW", "Mazda", "Ford"};
    * for an integer array:
    * int [] myNum = {10, 4, 90, 15};  // to print this though or any primitive you have to do System.out.println(Arrays.toString(myNum) + );
    * or you can write it as 
    * double [] prices = new double[10];
    *  
    *  Access an array element:
    *  you can access array element by referring to the index number. // arrayname[index]
    *  String[] cars = {"Volvo", "BMW", "Ford", "Mazda";
    *  System.out.println(cars[0]);
    *  //output Volvo.
    *  
    *  Change an Array Element:
    *  to change value of a specific element refer to index number:
    *  cars[0] = "Opel";
    *  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    *  cars[0] = "Opel";
    *  System.out.println(cars[0]);
    *  //Now outputs Opel instead of volvo. 
    *  
    *  Array Length:
    *  to find out how many elements an array has use length property:
    *  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    *  System.out.println(cars.length);
    *  //outputs 4.
    *  
    *  LOOP through an Array:
    * loop through an array using for loop and use length property to specify how many times loop should run.
    */ String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
       for (int i = 0; i < cars.length; i++) {
       System.out.println(cars[i]);   // outputs Volvo, BMW, Ford, Mazda because length is + 1 then index so index is 3 but since length is 4 prints everything. cause i initially though < car.length would mean only 3 cars printed.
       } 
    /*   LoOP through an Array with For-Each:
    *   for-each loop used exclusively to loop through elements in arrays.
    *   for (type variable : arrayname) {
    * }
    * Example:
    * String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    * for (String i : cars) {
    * System.out.println(i);
    * }
    *  the above example can be read like this: for each string element (
		in cars, print out the value of i
	* if you  compare the for loop and for - each loop you see that the for-each method is easier to write and does not require a counter (using the length property).
    */
        
    /* Multidimensional Arrays:
     * is an array of arrays.
     * to create two dimensional array add each array within its own set of curly braces.
     * eg: int[] [] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
     * myNumbers is now an array with two arrays as its elements.
     * to acess the elements of myNumbers array specify two indexes: one for array, and one for the element inside that array. 
     *example:
     *int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7
     */
        // we can also use for loop inside another for loop to get elements of a two dimensional array. (we still have to point to the two indexes):
        //int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        //for (int i = 0; i < myNumbers.length; ++i) {
         // for(int j = 0; j < myNumbers[i].length; ++j) {
          //  System.out.println(myNumbers[i][j]);
         // }
        //}
    	 
	}

}
