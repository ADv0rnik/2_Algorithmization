//Calculate the sum of numbers whose ordinal numbers are prime numbers
public class Exercise06 {
    public static void main(String[] args) {
        double[] num = {0.2, 4, 1.8, 2, 4.3, 4.5, 8, 5, 6.9, 3};
        int sum = 0;
        for (double i : num) {

            for (int j = 2; j < i; i++) {
                if (i % j == 0) {

                }


            /*int n = 2;
            if(num[(int) i] % n == 0);
            sum += num[(int)i];
            n++;*/
            }
            // System.out.println(sum);
        }
    }
}
