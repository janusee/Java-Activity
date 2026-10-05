
package activity.pkg1.in.java;


public class Expert {
    public static void main(String[] args) {
        
        // Byte overflow: 127 is the maximum value of byte.
        byte number = 127;
        number++;
        System.out.println("Byte overflow: " + number);

        String a = new String("Hello");
        String b = new String("Hello");
        String c = "Hello";

        //a == b is false because they are differentString objects.
        System.out.println(a == b);

        //a.equals(b) is true because their text is the same.
        System.out.println(a.equals(b));

        //a == c is false because they refer to different objects.
        System.out.println(a == c);

        //a.equals(c) is true because their text iss the same.
        System.out.println(a.equals(c));

        // Array references
        int[] array1 = {1, 2, 3};
        int[] array2 = array1;

        array2[0] = 99;

        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);
      
    }
}
