
package week4;

import java.util.Scanner;


public class Expert4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] inventory = {
            {10, 20, -1},
            {5, 25, 30},
            {12, -1, 18}
        };

        int choice;
        do {
            System.out.println("\n1. Display Inventory");
            System.out.println("2. Total Inventory");
            System.out.println("3. Find Critical Shelf");
            System.out.println("4. Restock Shelf");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            if (choice == 1) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (inventory[i][j] == -1) {
                            System.out.print("X ");
                            continue;
                        }
                        System.out.print(inventory[i][j] + " ");
                    }
                    System.out.println();
                }

            } else if (choice == 2) {
                int total = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (inventory[i][j] == -1) {
                            continue;
                        }
                        total += inventory[i][j];
                    }
                }

                System.out.println("Total items: " + total);

            } else if (choice == 3) {
                boolean found = false;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (inventory[i][j] >= 0
                                && inventory[i][j] < 10) {
                            System.out.println(
                                "Critical shelf: Row " + (i + 1)
                                + ", Column " + (j + 1)
                            );
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No critical shelf found.");
                }

            } else if (choice == 4) {
                System.out.print("Enter row(1-3): ");
                int row = sc.nextInt();

                System.out.print("Enter column (1-3): ");
                int col = sc.nextInt();

                if (row < 1 || row > 3 || col < 1 || col > 3) {
                    System.out.println("Invalid shelf position.");
                } else if (inventory[row - 1][col - 1] == -1) {
                    System.out.println("Shelf is damaged!");
                } else {
                    System.out.print("Quantity to add: ");
                    int amount = sc.nextInt();

                    while (amount < 0) {
                        System.out.print("Enter a positive amount: ");
                        amount = sc.nextInt();
                    }

                    inventory[row - 1][col - 1] += amount;
                    System.out.println("Restocking successful!");
                }

            } else if (choice == 5) {
                System.out.println("Thankyou!");

            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
