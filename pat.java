
// Java program for printing
// the rectangular pattern
import java.io.*;

class GFG {

    // Function to print the pattern
    static void printPattern(int n) {
        int arraySize = n * 2 - 1;
        int[][] result = new int[arraySize][arraySize];

        // Fill the values
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                result[i][j] = Math.max(Math.abs(i - arraySize / 2),
                        Math.abs(j - arraySize / 2)) + 1;
            }
        }

        // Print the array
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 2;

        printPattern(n);
    }
}

// This code is contributed
// by MohitSharma23.
