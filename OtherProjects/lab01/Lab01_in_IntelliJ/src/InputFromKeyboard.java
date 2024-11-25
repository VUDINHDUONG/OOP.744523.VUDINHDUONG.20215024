// 6.2: InputFromKeyboard
import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {

        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String strName = scanner.nextLine();
        System.out.println("How old are you?");
        int iAge = scanner.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = scanner.nextDouble();

        System.out.println("Mrs/Ms." + strName + ", " + iAge + " years old. "
                + "Your height is " + dHeight + ".");

        scanner.close();
    }
}
