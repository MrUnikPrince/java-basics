public class sumof2a {
    public static void main(String[] args) {
        int arr1[] = {6,9,2};
        int arr2[]= {5,9,2};
        int arr3[] = sumOfTwoArrays(arr1, arr2);

        printarr(arr3);

    }

    private static void printarr(int[] arr3) {
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }

    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
        int carry = 0, k, i, j;
        int[] arr3;
        if (arr1.length > arr2.length) {
            arr3 = new int[arr1.length + 1];
            i = arr1.length - 1;
            j = arr2.length - 1;
            while (i >= 0 && j >= 0) {
                arr3[i + 1] = (arr1[i] + arr2[j] + carry) % 10;
                carry = (arr1[i] + arr2[j] + carry) / 10;
                i--;
                j--;
            }
            for (k = i + 1; k > 0 && i >= 0; k--) {
                arr3[k] = (arr1[i] + carry) % 10;
                carry = (arr1[i] + carry) / 10;
                i--;
            }
            arr3[0] = carry;
        } else {
            arr3 = new int[arr2.length + 1];
            i = arr1.length - 1;
            j = arr2.length - 1;
            while (i >= 0 && j >= 0) {
                arr3[j + 1] = (arr1[i] + arr2[j] + carry) % 10;
                carry = (arr1[i] + arr2[j] + carry) / 10;
                i--;
                j--;
            }
            for (k = j + 1; k > 0 && j >= 0; k--) {
                arr3[k] = (arr2[j] + carry) % 10;
                carry = (arr2[j] + carry) / 10;
                j--;
            }
            arr3[0] = carry;
        }
        return arr3;
    }
}
