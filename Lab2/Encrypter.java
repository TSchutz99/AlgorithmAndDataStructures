package Lab2;

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

        for(int i = 0; i < numRows; i++)
            for(int j = 0; j < numColumns; j++)
                cipherGrid[i][j] = String.valueOf(plaintext.charAt(i+j));

        for(int i = 0; i < numColumns; i++)
            for(int j = 0; j < numRows; j++)
                cipherText += cipherGrid[i][j];

        // For test purposes
        System.out.println(cipherText);

        return cipherText;
    }
}
