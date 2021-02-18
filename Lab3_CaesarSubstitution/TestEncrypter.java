package Lab3_CaesarSubstitution;

import javax.swing.*;

public class TestEncrypter {
    public static void main(String[] args) {
        // Input used for test purpose 'This is a secret Message dude'
        String plainText = JOptionPane.showInputDialog("Please input some text to be encrypted:");
        int offset = Integer.parseInt(JOptionPane.showInputDialog("Please input a number:"));

        String cipherText = Encrypter.encrypterCaesarCipher(plainText, offset);

        JOptionPane.showMessageDialog(null, cipherText, "Encrypted Text",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, Encrypter.decryptRowColumn(cipherText, offset),
                "Decrypted Text", JOptionPane.INFORMATION_MESSAGE);
    }
}
