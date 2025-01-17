
// JAVA Code for Find maximum (or minimum)
// sum of a subarray of size k
import java.util.*;

class GFG {

    // Returns maximum sum in a subarray of size k.
    public static int maxSum(int arr[], int n, int k) {

        // k must be smaller than n
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int res = 0;
        for (int i = 0; i < k; i++)
            res += arr[i];

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int curr_sum = res;
        for (int i = k; i < n; i++) {
            curr_sum += arr[i] - arr[i - k];
            res = Math.max(res, curr_sum);
        }

        return res;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
// This code is contributed by Arnav Kr. Mandal.
