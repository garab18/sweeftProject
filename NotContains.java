public class NotContains {
    public static int notContains(int[] array){
        int positiveStart = 0;
        int temp;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 1){
                temp = array[positiveStart];
                array[positiveStart] = array[i];
                array[i] = temp;
                positiveStart++;
            }
        }
        int positiveLength = array.length - positiveStart;
        for (int i = 0; i < positiveLength; i++){
            temp = Math.abs(array[i + positiveStart]);
            if (temp - 1 < positiveLength && array[temp - 1 + positiveStart] > 0){
                array[temp - 1 + positiveStart] = -array[temp - 1 + positiveStart];
            }
        }
        for (int i = 0; i < positiveLength; i ++){
            if (array[i + positiveStart] > 0) return i + 1;
        }
        return positiveLength + 1;
    }

    public static void main(String[] args) {
        System.out.println(notContains(new int[] {1, 2, 3, 4}));         //5
        System.out.println(notContains(new int[] {-1, 1, 2, 3, -5}));    //4
        System.out.println(notContains(new int[] {-1, 5, 3, -7, 1, 2})); //4
        System.out.println(notContains(new int[] {-1, -5, 3, -7, 2}));   //1
        System.out.println(notContains(new int[] {}));                   //1
        System.out.println(notContains(new int[] {-1, -2 , -3}));        //1
        System.out.println(notContains(new int[] {-1, -2, 1, 3, -7}));   //2
        System.out.println(notContains(new int[] {0, 0, -1, 2}));        //1
    }
}
