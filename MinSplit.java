public class MinSplit {
    public static int minSplit(int amount){
        return amount/50 + amount%50/20 + amount%50%20/10 + amount%50%20%10/5 + amount%50%20%10%5;
    }

    public static void main(String[] args) {
        System.out.println(minSplit(96));   //5
        System.out.println(minSplit(0));    //0
        System.out.println(minSplit(150));  //3
        System.out.println(minSplit(127));  //6
        System.out.println(minSplit(4));    //4
        System.out.println(minSplit(16));   //3
    }
}
