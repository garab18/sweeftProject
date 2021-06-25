public class CountVariants {
    public static int countVariants(int stairsCount){
        if (stairsCount < 4){
            return stairsCount;
        }
        return countVariants(stairsCount - 1) + countVariants(stairsCount - 2);
    }
    public static void main(String[] args) {
        System.out.println(countVariants(2));   //2
        System.out.println(countVariants(4));   //5
        System.out.println(countVariants(5));   //8
    }
}
