/*Create a program that demonstrates narrowing conversion from double to int and prints the result. */

import java.util.Scanner;
public class DoubleInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the double value:");
        double a = sc.nextDouble();
        int b = (int) a; 
        System.out.println("Double value: " + a);
        System.out.println("Integer value: " + b);
    }
}
