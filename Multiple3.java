public class Multiple3 {
    public static void main(String[] args) {
        System.out.println(multiple(201, 500));
    }

    public static int multiple(int start, int end) {
        int sum = 0;
        for (int k = start; k < end; k++) {
            if (k % 3 == 0) {
                sum += k;
            }
        }
        return sum;
    }
}