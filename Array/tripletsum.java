public class tripletsum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int x = 12;
        tripletSum(arr, x);
    } 


    public static void tripletSum(int[] arr, int x){ 
        int count = 0 ;
        for(int i = 0 ; i<arr.length-2;i++){
            for(int j = i+1 ; j<arr.length-1;j++){
                for(int k = j+1 ; k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x)
                    {
                        // int max = Math.max(arr[i], Math.max(arr[j], arr[k]));
                        // int min = Math.min(arr[i], Math.min(arr[j], arr[k]));
                        // int mid = x - max - min;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    } 
       
}
