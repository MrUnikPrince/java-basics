package recursion;

public class optimizepower {
    public static void main(String[] args) {
        int a = 5;
        int n = 10;
        System.out.println(optimizePower(a,n));
    }

    public static int optimizePower(int a, int n) {
        if(n == 0){
            return 1;
        }
        // int halfpower = optimizePower(a, n/2);
        int halfpowerSq = optimizePower(a, n/2) * optimizePower(a, n/2);
        return halfpowerSq;
    }
}