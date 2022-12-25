package recursion;

public class firstOcc {
    public static void main(String[] args) {
        // int arr [] = {2,8,5,9,5,4,5,1};
        // System.out.println(firstOccurance(arr,3,0));
        // System.out.println(lsstOccurance(arr,3,0));
        // System.out.println(power(2,10));
        
        int a = 2;
        int n =7;
        System.out.println(OptimizedPower(a,n));
    }

    private static int lsstOccurance(int[] arr, int k, int i) {
        if(i == arr.length){
        return -1;
    }
        int isfound = lsstOccurance(arr, k, i+1);
        if(isfound == -1 && arr[i] == k){
            return i;
        }
        return isfound;
    }

    private static int firstOccurance(int[] arr, int k, int i) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==k){
            return i;
        }
        return firstOccurance(arr, k, i+1);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
   
    public static int OptimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = OptimizedPower(a, n/2);
        int halfpowerSq = halfpower * halfpower;
        
        if(n % 2 != 0){
            halfpowerSq *= a;
        }
        return halfpowerSq;
    }
}
