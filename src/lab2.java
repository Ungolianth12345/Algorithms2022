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

        String plaintext = "THISI SASEC RETME SSAGE";

        String ciphertext = Encrypter.encryptCaesarCipher(plaintext, 3);
        System.out.println("Test case 1\nOffset: 3\nExpected:\tWKLVL VDVHF UHWPH VVDJH\nActual:\t\t" + ciphertext);

        String ciphertext2 = Encrypter.encryptCaesarCipher(plaintext, 7);
        System.out.println("\nTest case 2\nOffset: 7\nExpected:\tAOPZP ZHZLJ YLATL ZZHNL\nActual:\t\t" + ciphertext2);

        String ciphertext3 = Encrypter.encryptCaesarCipher(plaintext, 65);
        System.out.println("\nTest case 3\nOffset: 65 (13)\nExpected:\tGUVFV FNFRP ERGZR FFNTR\nActual:\t\t" + ciphertext3);

        String ciphertext4 = Encrypter.encryptCaesarCipher(plaintext, -1);
        System.out.println("\nTest case 4\nOffset: -1\nExpected:\tSGHTH RZRDB QDSLD RRZFD\nActual:\t\t" + ciphertext4);
    }
}
