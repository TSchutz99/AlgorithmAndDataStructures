package Lab2;

import javax.swing.*;

public class Encrypter {
    public static String encrypterRowColum(String plaintext, int numColumns){
        int numRows;
        String cipherText = "";

        plaintext = plaintext.replace(" ", "");

        if(plaintext.length() % (float)numColumns != 0){
            numRows = (int)Math.ceil(plaintext.length() / (float)numColumns);

            while(plaintext.length() % (float)numColumns != 0)
                plaintext += "x";
        }
        else
            numRows = (int)(plaintext.length() / (float)numColumns);

        String[][] cipherGrid = new String[numRows][numColumns];

        int k = 0;
        for(int i = 0; i < numRows; i++)
            for(int j = 0; j < numColumns; j++){
                cipherGrid[i][j] = String.valueOf(plaintext.charAt(k));
                k++;
            }

        for(int i = 0; i < numColumns; i++)
            for(int j = 0; j < numRows; j++)
                cipherText += cipherGrid[j][i];

        // For test purposes
        //JOptionPane.showMessageDialog(null,cipherGrid,"Test", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(plaintext);
        //System.out.println(cipherText);

        return cipherText.replaceAll("(.{" + numColumns + "})", "$1 ").trim();
    }

    public static String decryptRowColumn(String cipherText, int numColumns)
    {
        int numRows;
        String plaintext = "";

        cipherText = cipherText.replace(" ", "");

        if(cipherText.length() % (float)numColumns != 0)
            numRows = (int)Math.ceil(cipherText.length() / (float)numColumns);
        else
            numRows = (int)(cipherText.length() / (float)numColumns);

        String[][] cipherGrid = new String[numRows][numColumns];

        int k = 0;
        for(int i = 0; i < numColumns; i++)
            for(int j = 0; j < numRows; j++){
                cipherGrid[j][i] = String.valueOf(cipherText.charAt(k));
                k++;
            }

        for(int i = 0; i < numRows; i++)
            for(int j = 0; j < numColumns; j++)
                plaintext += cipherGrid[i][j];

        System.out.println(plaintext);

        return plaintext;
    }
}
