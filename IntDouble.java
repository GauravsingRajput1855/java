//Write a program that demonstrates widening conversion from int to double and prints the result. 
import java.util.Scanner;
public class IntDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value:");
        int a = sc.nextInt();
        double b = a; 
        System.out.println("Int value: " + a);
        System.out.println("Double value: " + b);
    }
}
	