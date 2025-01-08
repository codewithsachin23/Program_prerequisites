import java.util.*;

public class KilometerstoMiles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in kilometers: ");
		double kilometers= sc.nextInt();
		
		double miles = kilometers*0.621371;
		System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
	}
}