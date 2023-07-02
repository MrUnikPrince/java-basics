package string;

public class palindrome {
    public static void main(String[] args) {
        String str = "noaa";
        System.out.print(palindrome(str));
        
    }

    private static boolean palindrome(String str) {
        for(int i=0; i<str.length(); i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
