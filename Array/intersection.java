
// Java program to implement the approach
import java.util.*;

class intersection {
    // Function to find union
    static void Union(int[] a, int[] b, int n, int m) {

        int[] result = new int[n + m];

        int index = 0;
        int left = 0, right = 0;
        while (left < n && right < m) {

            if (a[left] < b[right]) {
                if (index != 0
                        && a[left] == result[index - 1]) {
                    left++;
                } else {
                    result[index] = a[left];
                    left++;
                    index++;
                }
            } else {
                if (index != 0
                        && b[right] == result[index - 1]) {
                    right++;
                } else {
                    result[index] = b[right];
                    right++;
                    index++;
                }
            }
        }

        while (left < n) {
            if (index != 0
                    && a[left] == result[index - 1]) {
                left++;
            } else {
                result[index] = a[left];
                left++;
                index++;
            }
        }

        while (right < m) {
            if (index != 0
                    && b[right] == result[index - 1]) {
                right++;
            } else {
                result[index] = b[right];
                right++;
                index++;
            }
        }

        System.out.print("Union: ");
        for (int k = 0; k < index; k++)
            System.out.print(result[k] + " ");
        System.out.println("");
    }

    // Function to find intersection
    static void intersection(int[] arr1, int[] arr2, int n, int m) {

        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[n + m];
        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr1[i] > arr2[j])
                j++;
            else {
                if (k != 0 && arr1[i] == arr3[k - 1]) {
                    i++;
                    j++;
                } else {
                    arr3[k] = arr1[i];
                    i++;
                    j++;
                    k++;
                }
            }
        }
        System.out.print("Intersection: ");
        for (int x = 0; x < k; x++)
            System.out.print(arr3[x] + " ");

    }

    public static void inter2(int arr1[], int arr2[]) {

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;

                }
            }

        }

    }



    

    // Driver Code
    public static void main(String[] args)
	{
		int[] a = { 2,1,2,2 }; //2 6 8 5 4 3
		int[] b = { 2,2,2,2};  //2 3 4 7

		int n = a.length;
		int m = b.length;

		// sort
		Arrays.sort(a);
		Arrays.sort(b);

		// Function call
		//Union(a, b, n, m);
		// intersection(a, b, n, m);
        inter2(a, b);
	}
}

// This code is contributed by phasing17
