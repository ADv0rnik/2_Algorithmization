//Calculate the sum of numbers whose ordinal numbers are prime numbers
public class Exercise06 {
    public static void main(String[] args) {
        double[] num = {0.2, 4, 1.8, 2, 4.3, 4.5, 8, 5, 6.9, 3};
        int sum = 0;
        for (int i = 0; i< num.length; i++) {
           if(isPrime(i)){
                sum+=num[i];
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int value){
        if(value<2){
            return false;
        } else {
            for(int i = 2; i<= value/2; i++){
                if(value%i == 0){
                    return false;
                }
            }
        } return true;
    }
}
