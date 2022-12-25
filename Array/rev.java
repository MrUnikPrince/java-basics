package Array;
public class rev {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rever(arr);
        printAll(arr);
        
        

}

    private static void rever(int arr[]) {
        int temp[]= new int [arr.length];

        int l = arr.length;
        for (int i = 0; i < arr.length; i++) {
            temp[l - 1] = arr[i];
            l--;        
    }
}
public static void printAll(int arr[]) {
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }        
}
}