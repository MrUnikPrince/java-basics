public class swapAlternate {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {2,1,4,3,5,6};
        swapAlt(arr,n);
        printarr(arr);
    }

    private static void swapAlt(int[] arr, int n) {
        
        for(int i=0; i<arr.length-1; i +=2){
            int temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1] = temp;


        }
    }
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
