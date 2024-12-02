package String;

public class Palindrom {

    public static boolean printPalindrom(String str){
        for(int i =0 ; i<str.length()/2 ;i++){
            int n  = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not palindrom 
                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(printPalindrom(str));
    }
}
