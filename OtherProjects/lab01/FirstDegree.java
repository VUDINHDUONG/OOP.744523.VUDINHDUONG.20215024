// 2.2.6: The first-degree equation 
// ax + b = 0 (a!=0)
import java.util.Scanner;

public class FirstDegree {
	public static void main(String[] args) {
		
		// Create object scanner to get data from user 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a: ");
		
		// Get double number from user
		double a = scanner.nextDouble();
		
		// If a = 0 then read again
		while(a == 0) {
			a = scanner.nextDouble();
		};
		
		// Read b from user
		System.out.println("Input b: ");
		double b = scanner.nextDouble();
		
		//the real roots of the equations 
		double output = -b/a;
		
		// Print Result
		System.out.println("Output x = " + output);
		// Method closes this scanner
		scanner.close();
	}
}