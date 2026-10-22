
import java.util.Scanner;


public class Intermediate3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double purchaseamount, discount, finalPrice;
        String tier;

        System.out.print("Enter purchase amount: ");
        purchaseamount = input.nextDouble();

        if (purchaseamount >= 5000) {
            discount = 0.15;
            tier = "15% Discount";
        } else if (purchaseamount >= 3000) {
            discount = 0.10;
            tier = "10% Discount";
        } else if (purchaseamount >= 1000) {
            discount = 0.05;
            tier = "5% Discount";
        } else {
            discount = 0.00;
            tier = "No Discount";
        }

        finalPrice = purchaseamount - (purchaseamount * discount);
        System.out.println("Discount Tier: " + tier);
        System.out.println("Final Price: " + finalPrice);

        input.close();
    }
}
