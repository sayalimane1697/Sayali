package practice_1;

import java.util.Scanner;

public class Questions {
	
// (1) calculate factorial of number
//     Factorial of a number is the product of all the positive numbers less than or equal to the number. The factorial of a number n is denoted by n! 		
//
//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in); //Scanner object for capturing the user input
//		System.out.println("Enter the number");
//		int num = input.nextInt(); //Stored the entered value in variable 
//		int factorial = fact(num); //Called the user defined function fact 
//		System.out.println("Factorial of number is =  " + factorial);
//	
//	}
//	
//	static int fact(int n)
//	{
//		int output;
//		if(n==1) {
//		return 1;
//		}
//		output = fact(n-1)* n; //Recursion: Function calling itself!! 
//		return output;
//	}
	
	
// (2) calculate fibonacci series of number
//    It is a series in which the next term is the sum of the preceding two terms. For Example: 0 1 1 2 3 5 8 13
//	   
//	    public class Fibonacci() {
//	public static void main(String[] args) {
//	   
//	    int n=100, t1=0, t2=1; //initializing the constants 
//	    System.out.print("series " + n + ": "); 
//	     
//	    while(t1<= n) //while loop to calculate fibonacci series upto n numbers 
//	    {
//	    	System.out.print(t1 + " + "); 
//	    	int sum = t1 + t2; 
//	    	t1 = t2; 
//	    	t2 = sum; 
//	    }
//	    System.out.println();
//	}
//  }
	
	
// (3) find out whether the given String is Palindrome or not
//    A palindrome is a number, string or a sequence which will be the same even after you reverse the order. For example, RACECAR, if spelled backward will be same as RACECAR. 	    
//	    
//	    public static void main (String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter your statement: ");
//		String str = sc.nextLine();
//		checkPalindrome(str);
//	    }
//	    
//	    static void checkPalindrome(String input)
//	    {
//	    	boolean p = true; //Assuming to be true
//	    	int length = input.length(); 
//	    	for(int i=0; i<= length/2; i++) //dividing length of the string by 2 & comparing it
//	    	{
//	    		if(input.charAt(i) != input.charAt(length-i-1))
//	    		{
//	    			p = false;
//	    			break;
//	    		}
//	    	}
//	    	System.out.println(input + " is palindrome: " + p);
//	    }
    
	
// (4) Java program to print alphabet A pattern

//		void display(int n)
//		{
//		
//		for (int i = 0; i<=n; i++) {  // Outer for loop for number of lines
//			
//			for(int j=0; j<=n/2; j++) {  // Inner for loop for logic execution
//				
//		// prints two column lines, print first line of alphabet, prints middle line	
//				if((j==0 || j==n/2) && i!=0 || i==0 && j!=n/2 || i==n/2)		     
//				
//				 System.out.println("*");
//					
//				else 
//				{
//			     System.out.println(" "); 
//				}
//				 System.out.println();				
//			}
//		}
//		}
//			
//		public static void main (String[] args) {
//		
//			Scanner sc = new Scanner(System.in);
//		    Questions qs= new Questions();
//		    qs.display(7);
//		}
		
		
		
		
		
}	
