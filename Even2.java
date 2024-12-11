public class Even2 {
    public static void main(String[] args) {
        System.out.println( solution(100,2000));
        }
    public static int solution( int start, int end){
        int sum = 0;
        for (int k =start;k<end;k++) {
            if(k%2==0) {
                sum+=k;
            }
        }
        return sum;
    }
}