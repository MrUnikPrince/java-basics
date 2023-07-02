package sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {90,80,50,40,20,30,70};
        sSort(arr);
        printarr(arr);
    }

    private static void printarr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void sSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                    int temp = arr[minPos];
                    arr[minPos] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
