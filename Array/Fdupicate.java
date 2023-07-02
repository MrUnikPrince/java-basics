public class Fdupicate {
    public static void main(String[] args) {
        int arr[] = {0, 7,2,5,4,7,1,3,6};
        int a = duplicate(arr);
        System.out.println(a);
        
    }

    public static int duplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    c++;
            }
            if(c==2){
                return arr[i];
            }
        }
        return 0;
    }
}
