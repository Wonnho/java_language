import java.lang.reflect.Array;
import java.util.Arrays;

public class Product {
    public static void main(String[] args) {
        int[ ] value=product(new int[] {1,2,3},5);
        System.out.println("value"+ Arrays.toString(value));
    }

      public static int[] product(int[] numbers,int n) {
        int[] product=new int[numbers.length*n];
        int index=0;
          for (int k = 0; k <n ; k++) {
              for(int number:numbers) {
                  product[index]=number;
                  index++;
              }

          }
          return product;
      }
}
