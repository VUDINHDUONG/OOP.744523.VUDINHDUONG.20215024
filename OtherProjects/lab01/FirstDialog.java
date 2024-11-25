//2.2.2	show message to dialog

/*
import Package javax to use dialog
specifically:
- javax is a package
- Swing is a Java Foundation Classes (JFC)
- JOptionPane is a class
*/
import javax.swing.JOptionPane;

public class FirstDialog{
	
	public static void main(String[] args){
		
		// Use method showMessageDialog to print text to cmd
		JOptionPane.showMessageDialog(null, "Hello world! How are you?");
		
		// exits current program by terminating running Java virtual machine
		System.exit(0);
	}// end of method main	
}