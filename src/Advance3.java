
import java.util.Scanner;

public class Advance3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;
        boolean unlocked;

        System.out.print("Enter username: ");
        username = input.nextLine();

        if (username.equals("januspogi")) {
            System.out.print("Enter password: ");
            password = input.nextLine();

            if (password.equals("12345")) {
                System.out.print("Is account unlocked? (true/false): ");
                unlocked = input.nextBoolean();

                if (unlocked == true) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Account is locked.");
                }

            } else {
                System.out.println("Incorrect password.");
            }

        } else {
            System.out.println("Incorrect username.");
        }

        input.close();
    }
}
