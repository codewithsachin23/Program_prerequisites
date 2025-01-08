import java.util.*;

public class AreaOfaCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a cricle");
			double radius = sc.nextDouble();
			double area = Math.PI * Math.pow(radius,2);
			System.out.println("AreaOfaCircle: " + area);
	}
}