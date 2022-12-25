package recursion;

public class fibonacciNum {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(printFib(n));
    }

    private static int printFib(int n) {
        if(n == 1 || n == 0 ){
            return n;
        }
        int fibn = printFib(n-1)+printFib(n-2);
        return fibn;
    }
}
