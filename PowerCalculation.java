import java.util.*;

public class PowerCalculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base: ");
		double base = sc.nextInt();
		System.out.print("Enter the exponent: ");
		double exponent= sc.nextInt();
		double result = Math.pow(base,exponent);
		System.out.println("Result: " + result);
	}
}