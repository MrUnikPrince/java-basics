public class swap01 {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1};
        sortBinaryArray(arr);
        printarr(arr);

    }
    private static void printarr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortBinaryArray(int[] arr){
		int i, count = 0;
		for( i = 0;i < arr.length;i++) {
			if(arr[i] == 0)
				count++;
		}
		for(i = 0; i < count;i++ ) {
			arr[i] = 0;
		}
		for(;i < arr.length;i++) {
			arr[i] = 1;
		}
	}
}
