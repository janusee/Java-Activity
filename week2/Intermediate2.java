
package week2;

import java.util.Scanner;


public class Intermediate2 {
     public static void main(String[] args) {
        double average = 74;
        int absences = 2;

        if ((average >= 75 && absences <= 3) || average >= 90) {
            System.out.println("PASS");
            System.out.println("You meet the grade requirements.");
        } else {
            System.out.println("FAIL");
            System.out.println("You do not meet the grade requirements.");
        }
    
    }
}
