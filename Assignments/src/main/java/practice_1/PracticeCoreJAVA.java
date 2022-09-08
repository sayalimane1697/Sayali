package practice_1;

import java.util.Scanner;

public class PracticeCoreJAVA {
	
	public static void main(String[] args) {
		
//		Methods_only d=new Methods_only();
//		if (true )
//		{
//		d.m1();
//		}
//		else
//		{
//			System.out.println("false");
//		}
		
		
//	    String[] arr= {"practice", "core", "java"};
//		for (int i=0; i< arr.length; i++)
//		{
//			if (arr[i].length()== 4 )
//			{
//				System.out.println(arr[i]);
//				//break;
//			}
//			else
//			{
//				System.out.println( arr[i]+" "+ "length not match to 4");
//			}
//		}
		
		
//	//String s = "practice core java";
//	for (int i=0; i< s.length(); i++)
//	{
//		System.out.println(s.charAt(i)); // it will print text by characters only
//	}
//	
//	for (int i=s.length()-1;i>=0;i--)
//	{
//		System.out.println(s.charAt(i)); // it will print text backward
//	
//	}

	
//		int i=1;
//		for(int a=1; a<=8; a++) // a = row
//		{
//			for(int b=1; b<=a; b++) //b = column
//			{
////				System.out.print(a+ " ");  
//				System.out.print(i+ " ");  
////				System.out.print(b+" "); 
//				i++;
//			}
//			System.out.println();
//		}
//	
		
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i = 0; i <= rows; i++) {
			 
            // loop to print the number of spaces before the star
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
 
            // loop to print the number of stars in each row
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
 
            // for new line after printing each row
            System.out.println();
        }
		
  }
	
}
