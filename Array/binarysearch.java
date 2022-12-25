package Array;

public class binarysearch {
    public static int bSearch(int arr[], int k) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;                
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(bSearch(arr,9));
        
    }
}    
    

