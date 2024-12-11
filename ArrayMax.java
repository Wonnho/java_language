public class ArrayMax {
    public static void main(String[] args) {
        arrayMax();
    }

    public static int arrayMax() {
        int [] arraymax={3,4,5,7,9,88};
        int maxNum=-9999999;
        for (int k = 0; k <arraymax.length ; k++) {
            if(maxNum<arraymax[k]) {
                maxNum=arraymax[k];
            }
        }
        System.out.println("Max in arraymax");
        System.out.println(maxNum);
       return maxNum;
    }
}
