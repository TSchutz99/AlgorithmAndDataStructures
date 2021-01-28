package Lab1;

import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Enter password:");

        isValid(password);

        while(!isValid(password)) {
            JOptionPane.showMessageDialog(null, "Password Not Valid",
                    "Password", JOptionPane.INFORMATION_MESSAGE);

            password = JOptionPane.showInputDialog("Enter password:");

            isValid(password);
        }

        JOptionPane.showMessageDialog(null, "Password Valid",
                    "Password", JOptionPane.INFORMATION_MESSAGE);

    }

    public static boolean isValid(String password){
        boolean upper = false, lower = false, digit = false;

        if(password.length() == 8) {
            for(int i = 0; i < 8; i++) {
                if(Character.isUpperCase(password.charAt(i)))
                    upper = true;
                if(Character.isLowerCase(password.charAt(i)))
                    lower = true;
                if(Character.isDigit(password.charAt(i)))
                    digit = true;
            }
        }

        if(!upper || !lower || !digit)
            return false;
        else
            return true;
    }
}
