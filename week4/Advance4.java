
package week4;


public class Advance4 {
    public static void main(String[] args) {

        int size = 5;

        //Outer loop controls the rows
        for (int i = 1; i <= size; i++) {

            //Skip row 3 using continue
            if (i == 3) {
                continue;//Skips this row and moves to the next iteration
                
            }

            //Inner loop controls the columns
            for (int j = 1; j <= size; j++) {

                //Stop printing the current row when j reaches 4
                if (j == 4) {
                    break;//Exits the inner loop only
                }

                System.out.print("* ");
            }

            //Move to the next line after each printed row
            System.out.println();
        }
    }
}
