
package week2;


public class Advance2 {
     public static void main(String[] args) {

        double balance = 1000;

        balance += 500;
        System.out.println("After adding: " +balance);

        balance *= 1.10;
        System.out.println("After 10% growth: " +balance);

        balance += 200;
        System.out.println("After adding again: " +balance);

        int count = 1;

        System.out.println("Postfix: " +count++);
        System.out.println("After count++: " +count);

        System.out.println("Prefix: " + ++count);
        System.out.println("After ++count: " + count);

        //count++ uses the current value first then it increases
        //++count increases the value first then uses the new value.
    }
}
