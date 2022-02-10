public class CaesarDriver {
    public static void main(String[] args) {
        String plaintext = "THISI SASEC RETME SSAGE";

        String ciphertext = lab2.Encrypter.encryptCaesarCipher(plaintext, 3);
        System.out.println("Test case 1\nOffset: 3\nExpected:\tWKLVL VDVHF UHWPH VVDJH\nActual:\t\t" + ciphertext);

        String ciphertext2 = lab2.Encrypter.encryptCaesarCipher(plaintext, 7);
        System.out.println("\nTest case 2\nOffset: 7\nExpected:\tAOPZP ZHZLJ YLATL ZZHNL\nActual:\t\t" + ciphertext2);

        String ciphertext3 = lab2.Encrypter.encryptCaesarCipher(plaintext, 65);
        System.out.println("\nTest case 3\nOffset: 65 (13)\nExpected:\tGUVFV FNFRP ERGZR FFNTR\nActual:\t\t" + ciphertext3);

        String ciphertext4 = lab2.Encrypter.encryptCaesarCipher(plaintext, -1);
        System.out.println("\nTest case 4\nOffset: -1\nExpected:\tSGHTH RZRDB QDSLD RRZFD\nActual:\t\t" + ciphertext4);
    }
}
