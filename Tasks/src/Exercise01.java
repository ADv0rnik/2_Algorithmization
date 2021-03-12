import java.util.Random;

//Find the sum of elements in the array A[N] that are multiples of a given K.
public class Exercise01 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        Random random = new Random();
        int k = random.nextInt(4);
        int sum = 0;
        if(k == 0){
            System.out.println("Division by 0");
        } else {
            System.out.println(k);
            for(int i : num){
                if(i%k == 0){
                    sum += i;
                }
            }
        }
        System.out.println("Sum of elements: "+sum);
    }
}