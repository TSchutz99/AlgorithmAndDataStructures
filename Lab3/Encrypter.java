package Lab3;

import javax.swing.*;

public class Encrypter {
    public static String encrypterCaesarCipher(String plaintext, int offset){
        StringBuilder cipherText = new StringBuilder("");
        plaintext = plaintext.toUpperCase().replace(" ","");

        if(offset >= 26){
            offset = Integer.parseInt(JOptionPane.showInputDialog("Offset must be less then 26, Please reenter:"));
        }

        char ch;
        for(int i = 0; i < plaintext.length(); i++)
        {
            ch = plaintext.charAt(i);
            ch = (char)(ch + offset);

            if(ch > 'Z'){
                ch = (char)(ch - 'Z' + 'A' - 1);
            }

            cipherText.append(ch);
        }

        return cipherText.toString().replaceAll("(.{" + 5 + "})", "$1 ").trim();
    }

    public static String decryptRowColumn(String cipherText, int offset){
        StringBuilder plainText = new StringBuilder("");
        cipherText = cipherText.replace(" ", "");

        if(offset >= 26){
            offset = Integer.parseInt(JOptionPane.showInputDialog("Offset must be less then 26, Please reenter:"));
        }

        char ch;
        for(int i = 0; i < cipherText.length(); i++)
        {
            ch = cipherText.charAt(i);
            ch = (char)(ch - offset);

            if(ch < 'A'){
                ch = (char)(ch + 'Z' - 'A' + 1);
            }

            plainText.append(ch);
        }

        return plainText.toString();
    }
}
