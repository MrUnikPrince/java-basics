package string;

public class countwords {
    public static void main(String[] args) {
        String str =" ";
        int noOfstr = countWords(str);
        System.out.println(noOfstr);
    }

    public static int countWords(String str) {
        if((str.length()==0)){
            return 0;
        }
        int words = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                words++;
        }
        
        return words;
    }
}
