// 2.2.3: get input from user and show to dialog

// import Package javax to use dialog
import javax.swing.JOptionPane;

public class HelloNameDialog{
	
	public static void main(String[] args){
		
		// Use method showInputDialog to get input from user
		String result = JOptionPane.showInputDialog("Please enter your name: ");
		
		// Use method showMessageDialog to print text to dialog
		JOptionPane.showMessageDialog(null, "Hi" + result + "!");
		
		// exits current program by terminating running Java virtual machine
		System.exit(0);
	}// end of method main	
}