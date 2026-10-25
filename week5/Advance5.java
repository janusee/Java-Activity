
package week5;

import java.util.Arrays;

public class Advance5 {
     public static void main(String[] args) {
        int[] scores = {83, 90, 78, 90, 88, 76, 92, 80, 97, 76, 83};

        int target = 92;
        int index = -1;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Score found at index: " + index);
        } else {
            System.out.println("Score not found.");
        }

        // Sort a copy so the original array stays unchanged
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original scores: " +Arrays.toString(scores));
        System.out.println("Sorted scores: " +Arrays.toString(sortedScores));
    }
}
