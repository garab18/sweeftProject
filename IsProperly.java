public class IsProperly {
    public static boolean isProperly(String sequence){
        int counter = 0;
        for(int i = 0; i < sequence.length(); i++){
            if (sequence.charAt(i) == '(') counter++;
            if (sequence.charAt(i) == ')') counter--;
            if (counter < 0) return false;
        }
        if (counter == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isProperly("(()())"));   //t
        System.out.println(isProperly("())()"));    //f
        System.out.println(isProperly(")"));        //f
        System.out.println(isProperly("("));        //f
        System.out.println(isProperly("((()))"));   //t
    }
}
