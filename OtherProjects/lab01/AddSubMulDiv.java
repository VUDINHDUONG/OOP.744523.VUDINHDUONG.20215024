/*
2.2.5	Write a program to calculate sum, difference, 
product, and quotient of 2 double numbers which are entered by users.
*/

import javax.swing.JOptionPane;

public class AddSubMulDiv {
	public static void main(String[] args) {
		
		String strNum1, strNum2;
		
		// Use method showInputDialog to get input from user
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		
		// Use method showInputDialog to get input from user
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		
		//To convert from String to double	
		double num1 = Double.parseDouble(strNum1);		
		double num2 = Double.parseDouble(strNum2);
		
		String noti = "Add Two Number: ";
		noti  += (num1 + num2);
		noti  += "\nSub Two Number:" + (num1 - num2);
		noti  += "\nMul Two Number:" + (num1 * num2);
		noti  += "\nDiv Two Number:" + (num1 / num2);
		
		
		JOptionPane.showMessageDialog(null, noti, 
				"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
					
		// exits current program by terminating running Java virtual machine	
		System.exit(0);
	}// end of method main	
}