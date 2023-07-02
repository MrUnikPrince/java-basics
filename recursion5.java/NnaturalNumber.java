package recursion5.java;

import java.text.BreakIterator;

public class NnaturalNumber {
    public static void main(String[] args) {
        int n= 10;
        naturalNumber(n);
    }

    private static void naturalNumber(int n) {
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        naturalNumber(n-1);
        System.out.print(n + " ");
    }
    
}
