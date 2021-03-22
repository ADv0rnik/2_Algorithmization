//Define max(a1 + a_2n, a2 + a_2n-1, ..., a_n + a_n+1) for an array of real numbers
public class Exercise07 {
    public static void main(String[] args) {
        int n = 10;
        double[] num = new double[n];
        for(int i =0; i< num.length; i++){
            num[i] = Math.random() *n -5;
            System.out.printf("%.1f\n", num[i]);
        }
        System.out.println();
        System.out.printf("%.1f\n", max(num));
    }
    public static double max(double[] arr) {
        double max = Double.MIN_VALUE;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            max = Double.max(max, arr[i] + arr[j]);
        }
        return max;
    }
}
