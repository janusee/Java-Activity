
import java.util.Scanner;


public class Expert {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username;
        int pin;
        double balance = 10000;
        double amount = 0;
        double limit = 0;
        double fee = 0;
        int tier;
        String account;

        System.out.print("Enter username: ");
        username = input.nextLine();

        if (username.equals("janusibardo")) {
            System.out.print("Enter 4-digit PIN: ");
            pin = input.nextInt();

            if (pin == 1234) {
                System.out.println("1.Bronze");
                System.out.println("2. Silver");
                System.out.println("3. Gold");
                System.out.println("4. Platinum");
                System.out.print("Choose account tier: ");
                tier = input.nextInt();

                if (tier == 1) {
                    account = "Bronze";
                    limit = 2000;
                } else if (tier == 2) {
                    account = "Silver";
                    limit = 5000;
                } else if (tier == 3) {
                    account = "Gold";
                    limit = 8000;
                } else if (tier == 4) {
                    account = "Platinum";
                    limit = 10000;
                } else {
                    account = "Invalid";
                }

                if (account.equals("Invalid")) {
                    System.out.println("DENIED: Invalid account tier.");
                } else {
                    System.out.print("Enter withdrawal amounnt: ");
                    amount = input.nextDouble();

                    if (amount <= 0) {
                        System.out.println("DENIED: Invalid withdrawal amount.");
                    } else if (amount > balance) {
                        System.out.println("DENIED: Insufficient balance.");
                    } else if (amount > limit) {
                        System.out.println("DENIED: Daily withdrawal limit exceeded.");
                    } else {
                        switch (tier) {
                            case 1:
                                fee = 0.05;
                                break;
                            case 2:
                                fee = 0.03;
                                break;
                            case 3:
                                fee = 0.02;
                                break;
                            case 4:
                                fee = 0.01;
                                break;
                        }

                        double transactionFee = amount * fee;
                        double total = amount + transactionFee;

                        if (total <= balance) {
                            System.out.println("APPROVED");
                            System.out.println("Account Tier: " +account);
                            System.out.println("Withdrawal: " +amount);
                            System.out.println("Transaction Fee: " +transactionFee);
                            System.out.println("Remaining Balance: " +(balance - total));
                        } else {
                            System.out.println("DENIED: Insufficient balance to cover withdrawal and fee.");
                        }
                    }
                }
            } else {
                System.out.println("DENIED: Incorrect PIN.");
            }

        } else {
            System.out.println("DENIED: Incorrect username.");
        }

        input.close();
    }
}
