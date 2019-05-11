package stk.util;
import javax.swing.*;  

public class ShowMessage {
    JFrame f;  
    public  void ShowError(String error, String title) {
        f=new JFrame();  
        JOptionPane.showMessageDialog(f,error,title,JOptionPane.WARNING_MESSAGE);     
    }
    public boolean ShowMessagerComfirm(String title) {
        f=new JFrame();  
        int opcion = JOptionPane.showConfirmDialog(f, title, "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (opcion == 0) { //The ISSUE is here
           return  true;
        } 
        return false;
    }
}
