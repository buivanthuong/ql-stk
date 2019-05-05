package stk.util;
import javax.swing.*;  

public class ShowMessage {
    JFrame f;  
    public  void ShowError(String error, String title) {
        f=new JFrame();  
        JOptionPane.showMessageDialog(f,error,title,JOptionPane.WARNING_MESSAGE);     
    }
}
