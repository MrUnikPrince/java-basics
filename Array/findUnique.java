import java.util.*;
public class findUnique {
    public static void main(String[] args) {
        int arr[] = {1,4,3,1,4};
        // int un = uniuenomber(arr);
        uniuenomb(arr);
        // System.out.println(uniuenomb(arr));
    }
    private static int uniuenomber(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(i !=j){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            }
            if(count == 0){
                return arr[i];
            }
        }
        return 0;
    }
    private static void uniuenomb(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            if(count == 0){
                // return arr[i];
                System.out.println(arr[i]);
            }
        }
        // return 0;
    }
}
