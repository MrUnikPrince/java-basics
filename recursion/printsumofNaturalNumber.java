package recursion;

public class printsumofNaturalNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printSum(n));
    }

    private static int printSum(int n) {
        if(n == 1){
        return 1;
    }
    int sum = n + printSum(n-1);
    return sum;
    }
}
