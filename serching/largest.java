package serching;

public class largest {
    public static void main(String[] args) {
        int arr[] = {1,2,8,98,97,5,5,4};
        int l = secondLargestElement(arr);
        System.out.println(l);
                
    }
    public static int secondLargestElement(int[] arr) {
        if((arr.length<=1)||(arr[0]==arr[arr.length-1])) {
			return -2147483648;
		}
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>largest) {
			secondLargest=largest;
			largest=arr[j];
			}else if(arr[j]==largest) {
				continue;
			}else if(arr[j]<largest) {
				if(arr[j]>secondLargest) {
					secondLargest=arr[j];
				}
			}
		}
return secondLargest;

	}
}
