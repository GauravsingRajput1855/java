/*3) Write a program that performs arithmetic operations involving different data types (int, double, float)
and observes how Java handles widening conversions automatically. */

import java.util.Scanner;
class ArithmeticOperations{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int value");
		int a=sc.nextInt();
		System.out.println("Enter float value");
		float b=sc.nextFloat();
		System.out.println("Enter double value");
		double c=sc.nextDouble();
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("press no to perform operation");
		int d=sc.nextInt();
		
		switch (d){
			default :
				System.out.println("Enter valid number.");
				break;
			case 1:
				double add=a+b+c;
				System.out.println("Addition : "+add);
				break;
			case 2:
				double sub=a-b-c;
				System.out.println("Substration : "+sub);
				break;
			case 3:
				double mul=a*b*c;
				System.out.println("Multiplication : "+mul);
				break;
			case 4:
				double div=a/b/c;
				System.out.println("Division : "+div);
				break;
		}
	}
}
			
		
		