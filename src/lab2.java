public class lab2 {
    public static class Encrypter {
        public static String encryptRowColumn(String plaintext, int numColumns) {
            plaintext = plaintext.replaceAll("\\s+", "").toUpperCase();

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

        public static String decryptRowColumn(String cipherText, int numColumns) {
            String plaintext = encryptRowColumn(cipherText, numColumns);
            return encryptRowColumn(plaintext, numColumns);
        }

        public static String encryptCaesarCipher(String plaintext, int offset) {
            // offset has to be positive
            plaintext = plaintext.toUpperCase();

            if (offset >= 26)
                offset %= 26;

            StringBuilder ciphertext = new StringBuilder();

            for (int i = 0; i <= plaintext.length() - 1; i++) {
                char ch = plaintext.charAt(i);
                if (ch != ' ') {
                    ch += offset;
                    if (ch > 'Z') {
                        ch -= 26;
                    } else if (ch < 'A') {
                        ch += 26;
                    }
                    ciphertext.append(ch);
                } else {
                    ciphertext.append(' ');
                }
            }

            return ciphertext.toString();
        }
    }

    public static void main(String[] args) {
        //String plaintext = "secret message";
        //System.out.println(Encrypter.encryptRowColumn(plaintext, 4));

        //String plaintext2 = Encrypter.decryptRowColumn(plaintext, 4);
        //System.out.println(plaintext2);


    }
}
