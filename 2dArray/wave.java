public class wave {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }};
        int m = arr[0].length;
        int n = arr.length;
        wavep(arr, m, n);
    }

    private static void wavep(int[][] mat, int n, int m) {
        if (mat.length == 0) {
            return;
        }
        for (int col = 0; col < m; col++) {
            int row = 0;
            if ((col % 2) == 0) {

                for (row = 0; row < n; row++) {
                    System.out.print(mat[row][col] + " ");
                }
            } else {
                for (row = n - 1; row >= 0; row--) {
                    System.out.print(mat[row][col] + " ");
                }
            }

        }
    }

}
