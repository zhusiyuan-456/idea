import javax.swing.*;
import java.util.*;
public class PassWord {
    public static void main(String[] args) {
        int option= JOptionPane.YES_OPTION;
        while(option==JOptionPane.YES_OPTION){
            try{
                String password=JOptionPane.showInputDialog("Please enter password :\n"+" must have at least eight characters.\n"+
                        " must consists of only letters and digits.\n"+" must contain at least two digits.\n");
                isValidPassWord(password);
                option=JOptionPane.showConfirmDialog(null,"valid PassWord"+"\nDo you want to continue?");
            }
            catch(Exception e){
                String outputStr="Invalid Password!\n"+e.getMessage()+"\n Do you want to continue?";
                option=JOptionPane.showConfirmDialog(null,outputStr);
            }
        }
    }

    private static void isValidPassWord(String password)throws Exception{
        if (password.length()<8)throw new Exception("must have at least eight characters");
        if (!hasNDigits(password))throw new Exception("The password must have at least 2 digits");
        if (!isOnlyLettersAndDigits(password))throw new Exception("must consists of only letters and digits");
    }
    public static boolean hasNDigits(String password) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
            if (numberOfDigits >= 2) {
                return true;
            }
        }
        return false;
    }
    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
