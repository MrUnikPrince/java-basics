package Array;

import javax.print.attribute.standard.RequestingUserName;

public class insert {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];
        arr = sorted(arr, n);
        int[] arr2 = arrange(n);
        // printarr(arr2);
        printarr(arr);
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sorted(int arr[], int n) {
        // int si = 0;
        int value = 1;
        int ei = n - 1;
        for (int i = 0; i < n; i++) {
            arr[i] = n;
        }

        for (int i = 0; i < n / 2; i++) {
            arr[i] = value;
            value++;

            arr[ei] = value;
            value++;
            // si++;
            ei--;
        }

        return arr;
    }

    public static int[] arrange(int n) {

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n;
        }
        for (int i = 0; i < n / 2; i++) {
            arr[i] = 2 * i + 1;
            arr[n - 1 - i] = 2 * i + 2;
        }

        return arr;

    }
}