public class sumoftArray{
    public static void main(String[] args) {
        int arr1[] = {2,5,4};
        int arr2[] = {8,4,6};
        int arr3[] = sumOfTwoArrays(arr1, arr2);
        System.out.println(arr3);
        System.out.println(sumOfTwoArrays(arr1, arr2));
        
    }
    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
        int len1=arr1.length,len2=arr2.length,len3,carry=0,sm;
        if(len1<=len2)
            sm=len1;
        else
            sm=len2;
        if(len1>=len2)
            len3=len1;
        else
            len3=len2;
        len3++;
        int arr3[]=new int[len3];
      
        for(int i=0;i<sm;i++)
        {
            arr3[len3-i-1]=(arr1[len1-i-1]+arr2[len2-i-1]+carry)%10;
           // carry=0;
            carry=(arr1[len1-i-1]+arr2[len2-i-1]+carry)/10;
        }
        if(len1>len2)
        {    for(int i=len2;i<len1;i++)
            {
                arr3[len3-i-1]=(arr1[len1-i-1]+carry)%10;
            //    carry=0;
                carry=(arr1[len1-i-1]+carry)/10;
            }
        }
        else if(len1<len2)
        {    for(int i=len1;i<len2;i++)
            {
                arr3[len3-i-1]=(arr2[len2-i-1]+carry)%10;
             //  carry=0;
                carry=(arr2[len2-i-1]+carry)/10;
            }
        }
            
        arr3[0]+=carry;
  
   
	return arr3;
    }

}