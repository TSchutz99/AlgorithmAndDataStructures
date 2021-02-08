package Lab2;

import javax.swing.*;

public class TestEncrypter {
    public static void main(String[] args) {
        // Input used for test purpose 'This is a secret Message dude'
        String plainText = JOptionPane.showInputDialog("Please input some text to be encrypted:");

        String cipherText = Encrypter.encrypterRowColum(plainText, 5);

        JOptionPane.showMessageDialog(null, cipherText, "Encrypted Text",
                JOptionPane.INFORMATION_MESSAGE);

        Encrypter.decryptRowColumn(cipherText, 5);
    }
}
