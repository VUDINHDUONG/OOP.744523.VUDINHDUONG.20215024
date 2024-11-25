// 2.2.6: The system of first-degree equations 

import java.util.Scanner;

public class TheSystemOfFirstDegree {
	public static void main(String[] args) {
		
		// Get input from user
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a11: ");
		double a11 = scanner.nextDouble();
		
		System.out.println("Input a12: ");
		double a12 = scanner.nextDouble();
		
		System.out.println("Input b1: ");
		double b1 = scanner.nextDouble();
		
		System.out.println("Input a21: ");
		double a21 = scanner.nextDouble();
		
		System.out.println("Input a22: ");
		double a22 = scanner.nextDouble();
		
		System.out.println("Input b2: ");
		double b2 = scanner.nextDouble();
		
		// Calulate determinant
		double D = a11*a22 - a21*a12;
		double D1 = b1*a22 - b2*a12;
		double D2 = a11*b2 - a21*b1;
		
		// D != 0 => two real roots
		if(D != 0) {
			double x1 = D1/D;
			double x2 = D2/D;
			
			System.out.println("Output x1 = " + x1);
			System.out.println("Output x2 = " + x2);
		}
		else {
			// D1 = 0 or D2 = 0 => don't have any real root
			if(D1 == 0 || D2 == 0) {
				System.out.println("The equation has no real root");
			}
			else {
				// D1 = 0 or D2 = 0 => have so much real root
				System.out.println("Equation with infinite real roots");
			}
		}			
		scanner.close();
	}
}