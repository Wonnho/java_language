import java.util.Arrays;

public class Proudct0 {
    public static void main(String[] args) {
        int[] outcome=product0(new int[] {7,8,9}, 3);
        System.out.println(Arrays.toString(outcome));
    }

    public static int[] product0( int[] numbers, int n) {
        int[] answer=new int[numbers.length*n];
        int index=0;
        for (int i = 0; i <n ; i++) {
            for(int number:numbers) {
                answer[index]=number;
                index++;

            }
        }
        return answer;
    }
}
