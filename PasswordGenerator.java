import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static String generatePassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();

        if (length < 4) {
            System.out.println("Password length should be at least 4 characters.");
        } else {
            String password = generatePassword(length);
            System.out.println("Generated Password: " + password);
        }

        scanner.close();
    }
}
