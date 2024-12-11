public class ArrayTest {
    public static void main(String[] args) {

        naturalNumber(3);
    }

    public static int naturalNumber(int n) {
//    int n=9;
        int[] nums = {3, 5, 7, 8, 9, 9};
        int count = 0;
        for (int k = 0; k <nums.length; k++) {
            if (n == nums[k]) {
                count += 1;
            }

        }
        System.out.println("count natural number, n in array nums");
        System.out.println(count);
         return count;
    }


}


