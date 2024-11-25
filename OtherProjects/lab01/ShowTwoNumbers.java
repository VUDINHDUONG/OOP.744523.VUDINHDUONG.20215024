// 2.2.4: Show Two Numbers

// import Package javax to use dialog
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
	public static void main(String[] args) {
		
		// Declare two String reference data variables
		String strNum1, strNum2;
		
		// Declare a variable containing the message content
		String strNotification = "You've just entered: ";
		
		// Use method showInputDialog to get input from user
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
				
		// Perform a string concatenation on the previous message		
		strNotification += strNum1 + " and ";
		
		// Use method showInputDialog to get input from user
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
				
		// Perform a string concatenation on the previous message	
		strNotification += strNum2;
		
		JOptionPane.showMessageDialog(null, strNotification, 
				"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
				
		// exits current program by terminating running Java virtual machine
		System.exit(0);
	}// end of method main	
}