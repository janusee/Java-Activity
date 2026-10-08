
package week.pkg2;

import java.util.Scanner;

public class Intermediate2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter average grade: ");
        double average = input.nextDouble();

        System.out.print("Enter number of absences: ");
        int absences = input.nextInt();

        if ((average >= 75 && absences <= 3) || average >= 90) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
}
}
