package practice_1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		double result;
		System.out.println("Enter two numbers");
		double firstNum = input.nextDouble();
		double secondNum = input.nextDouble(); 
		System.out.println("Enter Operator");
		char operator = input.next().charAt(0);
		
		switch(operator)
		{
		case '+': result = firstNum + secondNum;
		System.out.println("Addition = " + result);
		break;
		
		case '-': result = firstNum - secondNum;
		System.out.println("Subtraction = " + result);
		break;
		
		case '*': result = firstNum * secondNum;
		System.out.println("Multiplication = " + result);
		break;
		
		case '/': result = firstNum / secondNum;
		System.out.println("Division = " + result);
		break;
		
//		default: System.out.println("Enter valid operator");
	    
	    }

	}
}

