package Staircase;

public class Result {
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here

        System.out.println();
        int spaces = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - spaces; k++) {
                System.out.print("#");
            }
            spaces--;
            System.out.println();
        }
    }
}