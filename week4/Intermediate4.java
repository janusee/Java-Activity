
package week4;

import java.util.Scanner;

public class Intermediate4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number = input.nextInt();

        while (number != -1) {
            sum += number;
            number = input.nextInt();
        }

        System.out.println(sum);

        input.close();
    }
}
