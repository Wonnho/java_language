import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int number;
        number=13;

        int minNumber=999999;
        int[] numbers;
        numbers=new int[5];
        int [] numbers3=new int[] {1,2,3,4,5};
        int [] numbers2={1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.equals(numbers2,numbers3));

        //iterator
        char[] chars={'a','c','d'};
        for (char element:chars) {
            System.out.println("character:");
            System.out.println(element);
        }
        for (int k = 0; k < numbers3.length; k++) {
                if(numbers3[k]<minNumber) {
                    System.out.println("minimum number");
                    minNumber=numbers3[k];
                }

            }

            System.out.println(minNumber);
        }

}
