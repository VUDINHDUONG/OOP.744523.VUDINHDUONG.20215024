// 6.3: create project to draw triangle
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n from user
        System.out.println("Input n:");
        int n = scanner.nextInt();

        // Algorithm for drawing triangle
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}