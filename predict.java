
class MaximumSumPath {
    public static void main(String[] args) {
        int input1[] = { 1, 5, 10, 15, 20, 25 };
        int input2[] = { 2, 4, 5, 9, 15 };
        System.out.print(maxisumPath(input1, input2));
    }

    private static long maxisumPath(int[] input1, int[] input2) {
        long maxSum = 0, sum1 = 0, sum2 = 0;
        int i = 0;
        int j = 0;

        while (i < input1.length && j < input2.length) {
            if (input1[i] < input2[j]) {
                sum1 += input1[i];
                i++;
            } else if (input1[i] > input2[j]) {
                sum2 += input2[j];
                j++;
            } else {
                maxSum += Math.max(sum1, sum2) + input1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // take care of remaining elements after last intersection of element in array
        while (i < input1.length) {
            sum1 += input1[i];
            i++;
        }
        while (j < input2.length) {
            sum2 += input2[j];
            j++;
        }
        maxSum += Math.max(sum1, sum2);

        return maxSum;
    }

}

// This code has been contributed by Mayank Jaiswal
