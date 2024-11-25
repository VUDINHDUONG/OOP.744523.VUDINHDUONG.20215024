// 6.1: ChoosingOption

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {

        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first  class ticket?");

        JOptionPane.showMessageDialog(null, "You've chosen: "
                                        + ( option == JOptionPane.YES_OPTION ? "YES" : "NO" )
                                     );// Use ternary operator
        System.exit(0);
    }
}


//import javax.swing.JOptionPane;
//
//public class ChoosingOption {
//    public static void main(String[] args) {
//
//        String[] options = {"I do", "I don't"};
//
//        int option = JOptionPane.showOptionDialog(null,
//                "Do you want to change to the first class ticket?",
//                "Confirmation", // Dialog title
//                JOptionPane.YES_NO_OPTION, // Option type
//                JOptionPane.QUESTION_MESSAGE, // Message type
//                null, // Icon (null for default)
//                options, // Custom button text
//                options[0]); // Default selected option
//
//        if (option == JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(null, "You've chosen: I do");
//        } else if (option == JOptionPane.NO_OPTION) {
//            JOptionPane.showMessageDialog(null, "You've chosen: I don't");
//        }
//
//        System.exit(0);
//    }
//}

