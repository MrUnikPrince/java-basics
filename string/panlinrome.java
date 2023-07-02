package string;

public class panlinrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(checkPalindrome(str));
    }    
    public static boolean checkPalindrome(String str){
        boolean isPalindrome = true;
		for(int i = 0,j = str.length() - 1;i < (str.length()/2);i++,j--){
		if(str.charAt(i) != str.charAt(j)){
		isPalindrome = false;
		break;
		}
		}
		return isPalindrome;
		}
}
