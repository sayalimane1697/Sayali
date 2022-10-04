package practice_1;

import java.util.Scanner;

import org.checkerframework.checker.units.qual.Length;

public class PracticeCoreJAVA {
	
	public static void main(String[] args) {
		

// findout length of the word
		
//	String[] arr= {"practice", "core", "java", "python", "javac"};
//	for(int i=0; i<arr.length; i++) {
//		if(arr[i].length() == 4) {
//			System.out.println(arr[i]);
//		}
//		else {
//			System.out.println(arr[i]+ "- " +"length not match 4");
//		}
//	}
		

// print string value 1 by 1 char
		
//		String s = "practice core java";
//		for (int i=0; i< s.length(); i++)
//		{
//			System.out.println(s.charAt(i)); // it will print text by characters only
//		}
//		System.out.println();
//		
//		for (int i=s.length()-1;i>=0;i--)
//		{
//			System.out.println(s.charAt(i)); // it will print text backward
//		}
	
		
//		String s= "practice";
//		for(int i=0; i<s.length(); i++){
//		System.out.println(s.charAt(i));
//		}
//		System.out.println();
//
//		for(int j=s.length()-1; j>=0; j--){
//		System.out.println(s.charAt(j));
//		}
	    
		
		String[] arr = { "practice", "java", "python" };
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i].length() == 4) {
				System.out.println(arr[i] +"- " + "length match");
			} else {
				System.out.println(arr[i] +"- " + "length not match");
			}
		}
		
//		int i=1;
//		for(int a=1; a<=4; a++) // a = row
//		{
//			for(int b=1; b<=a; b++) //b = column
//			{
////				System.out.print(a+ " ");  
////				System.out.print(i+ " ");  
//				System.out.print(b+" "); 
//				i++;
//			}
//			System.out.println();
//		}
		
		
//		int i=1;							     //->	1 2 3 4
//		for(int j=1; j<=4; j++) {				 //		5 6 7
//												 //		8 9 	
//			for(int k=0; k<=4-j; k++) {			 //		10
//				System.out.print(i + " ");
//				i++;
//			}
//			System.out.println();
//		}
//		
//		int p=1;
//		for(int j1=1; j1<=4; j1++) {
//			for(int k1=0; k1<=4-j1; k1++) {
//				
//					int i1=p*3;
//				    System.out.print(i1 + " ");	
//				    p++;
//				
//			}
//			System.out.println();
//		}
		
// tringle 
		
//		int i=1;                                      
//		for(int j=1; j<=4; j++) {                   // ->   1
//			                                        //     2 3
//			for(int k=4; k>=1; k--) {               //    4 5 6
//				if(k>j) {  							//   7 8 9 10
//					System.out.print(" ");
//				}
//				else {
////					int i1 = i*3;
////					System.out.print(i1);
//					System.out.print(i);
//					System.out.print(" ");
//					i++;
//				}
//			}
//			System.out.println(" ");
//			
//		}
		
		
				
// odd/even numbers	
		
//		int i=0;  
//		while(i<=20) {
//			i++;
//			System.out.println(i);
//			i++;
//		//	i++;
//		}
//		

		

	
		
		
		
		
  }
	
}
