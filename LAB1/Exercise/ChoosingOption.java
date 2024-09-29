package Exercise;
// EX6.1
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        
        // Các tùy chọn tùy chỉnh
        Object[] options = { "I do", "I don’t" };
        
        // Hiển thị hộp thoại với các tùy chọn tùy chỉnh
        int option = JOptionPane.showOptionDialog(
            null, // Thành phần cha
            "Do you want to change the first class ticket?", // Câu hỏi hiển thị
            "Choose an option", // Tiêu đề của hộp thoại
            JOptionPane.YES_NO_OPTION, // Kiểu hộp thoại (Yes/No)
            JOptionPane.QUESTION_MESSAGE, // Loại thông báo (dấu hỏi)
            null, // Icon (null để không có icon)
            options, // Các tùy chọn tùy chỉnh
            options[0] // Giá trị mặc định (I do)
        );
        
        // Hiển thị thông báo kết quả tùy chọn
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == 0 ? "I do" : "I don’t"));
        System.exit(0);
    }
}
