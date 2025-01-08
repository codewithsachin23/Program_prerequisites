import java.util.*;

public class AverageofThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		double num2= sc.nextInt();
		System.out.print("Enter the third number: ");
		double num3= sc.nextInt();
		
		double result = (num1+num2+num3)/3;
		System.out.println("Result: " + result);
	}
}