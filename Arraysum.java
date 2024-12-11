public class Arraysum {
    public static void main(String[] args) {
        int arrsum=arraysum(new int[] {4,5,88,98,71});
        System.out.println("sum of array elements:"+arrsum);
    }

    public static int arraysum(int[] arrs) {
        int summ=0;
        for(int arr:arrs) {
            summ+=arr;
        }

        return summ;
    }
}
