// 2.2.6: The second-degree equation 

import java.util.Scanner;

public class TheSecondDegree {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Read a
		System.out.println("Input a: ");
		double a = scanner.nextDouble();
		
		// If a = 0 then read again
		while(a == 0) {
			a = scanner.nextDouble();
		};
		
		// Read b
		System.out.println("Input b: ");
		double b = scanner.nextDouble();
		
		// Read c		
		System.out.println("Input c: ");
		double c = scanner.nextDouble();
		
		// Calulate delta
		double delta = Math.pow(b, 2) - 4*a*c; //Use Math.pow to calulate square
		
		if (delta < 0) {
			System.out.println("The equation has no solution");
		}
		else if(delta == 0) {
			double output = -b/(2*a);
			System.out.println("Output x1 = x2 = " + output);
		}
		else {
			double x1 = (-b + Math.sqrt(delta))/(2*a);// Use Math.sqrt to calulate square root
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Output x1 = " + x1 + ", x2 = " + x2);
		}
		
		scanner.close();
	}
}