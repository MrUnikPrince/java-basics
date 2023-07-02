public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,7,8,4,3,9,4};
        bubbleSor(arr);
        printarr(arr);
    }

    private static void printarr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSor(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
}
