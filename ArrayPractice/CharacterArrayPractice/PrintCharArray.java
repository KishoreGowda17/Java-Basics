package ArrayPractice.CharacterArrayPractice;

import java.util.Arrays;

public class PrintCharArray {

    static char[] encryption(char msg[]) {
        int random = (int) (Math.random() * 10);

        char[] encrypted = new char[msg.length + 1];

        for (int i = 0; i < msg.length; i++) {
            encrypted[i] = (char) (msg[i] + random);
        }

        // Store the key in the last character
        encrypted[msg.length] = (char) ('0' + random);

        return encrypted;
    }

    static char[] decryption(char encrypted[]) {
        int n = encrypted.length;

        // Retrieve the key from the last character
        int key = encrypted[n - 1] - '0';

        char[] decrypted = new char[n - 1];

        for (int i = 0; i < n - 1; i++) {
            decrypted[i] = (char) (encrypted[i] - key);
        }

        return decrypted;
    }

    public static void main(String[] args) {
        String msg = "Hi , Hamza how are you ?";
        char[] message = msg.toCharArray();

        char[] encrypted = encryption(message);
        char[] decrypted = decryption(encrypted);

        System.out.println("Encrypted: " + Arrays.toString(encrypted));
        System.out.println("Decrypted: " + new String(decrypted));
    }
}
