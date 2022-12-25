package Array;

public class Sorting {
    public static void swlectionSort(int arr[]) {
        for (int i=0; i<arr.length;  i++){
            int minPos = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void insertationsort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-i;
            while(prev>=0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void sort0(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] = temp;
            }
        }        
    }

    public static void main(String[] args) {
            int arr[] = {0,0,0,1,2,5,7,8};
            sort0(arr); 
            printarr(arr);       
    }
}
