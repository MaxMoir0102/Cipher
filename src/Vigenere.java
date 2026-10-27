import java.util.Scanner;

public class Vigenere {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.println("**VIGENERE CYPHER**");
        System.out.println();
        System.out.print("Enter message (uppercase letters only): ");
        String message = in.nextLine().toUpperCase();

        System.out.print("Enter key (uppercase letters only): ");
        String key = in.nextLine().toUpperCase();
        String encryptedText = encrypt(message, key);
        System.out.println();
        System.out.println("**Results**");
        System.out.println("Encrypted Message: " + encryptedText);
       

        in.close();
    }

  
    public static String encrypt(String text, String key) {
        String result = "";
        int keyIn = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

           
            if (ch >= 'A' && ch <= 'Z') {
                
                int textNum = ch - 'A';
                int keyNum = key.charAt(keyIn) - 'A';
                int encryptedNum = (textNum + keyNum) % 26;
                result += (char) (encryptedNum + 'A');

                
                keyIn = (keyIn + 1) % key.length();
            } else {
               
                result += ch;
            }
        }

        return result;
    }}

  