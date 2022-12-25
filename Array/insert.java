package Array;

import javax.print.attribute.standard.RequestingUserName;

public class insert {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];
        arr = sorted(arr, n);
        printarr(arr);
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] sorted(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int ei = n - 1;
            int value = 1;
            int si = 0;
            arr[si] = value;
            value++;
            si++;
            arr[ei] = value;
            value++;
            ei--;
        }
        return arr;
    }
}