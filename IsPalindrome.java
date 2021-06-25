public class IsPalindrome {
    public static boolean isPalindrome(String text){
        for (int i = 0; i < text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));       //t
        System.out.println(isPalindrome("aba"));        //t
        System.out.println(isPalindrome("a"));          //t
        System.out.println(isPalindrome("abbca"));      //f
        System.out.println(isPalindrome("abcdcba"));    //t

    }
}
