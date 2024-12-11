public class ArrayMin {
    public static void main(String[] args) {
        int outcome=arrayMin(new int[] {3,8,7,9});
        System.out.println("min:"+outcome);
//        arrayMin(new int[] {3,8,7,9});

    }
    public static  int arrayMin( int[] numbers) {
           int minValue=Integer.MAX_VALUE;
            for(int num:numbers) {
                if(num<minValue){
                    minValue=num;
                }
        }
            return minValue;
}

}
