public class lab2 {
    public static String Encrypter(String plaintext, int numColumns) {
        plaintext = plaintext.replaceAll("\\s+","").toUpperCase();

        int numRows = plaintext.length() / numColumns;
        StringBuilder ciphertext = new StringBuilder();
        int addXes = 0;

        if (plaintext.length() % numColumns != 0) {
            addXes = numColumns - (plaintext.length() % numColumns);
            numRows++;
        }

        plaintext += "X".repeat(addXes);

        String[] text = plaintext.split("");

        for (int col = 0; col <= numColumns - 1; col++) {
            int index = col;
            for (int row = 0; row <= numRows - 1; row++) {
                ciphertext.append(text[index]);
                index += numColumns;
            }
        }

        return ciphertext.toString();
    }

    public static void main(String[] args) {
        String plaintext = "This is a secret message";
        System.out.println(Encrypter(plaintext, 5));
    }
}
