//Count number of positive, negative and zero elements in the array

public class Exercise03 {
    public static void main(String[] args) {
        int numOfNeg = 0;
        int numOfPos = 0;
        int numOfZero = 0;
        int n = 10;

        double[] num = new double[n];
        for(int i =0; i< num.length; i++){
            num[i] = Math.random() *n -5;
            System.out.printf("%.1f\n", num[i]);
        }
        for (double v : num) {
            if (v < 0) {
                numOfNeg++;
            } else if (v > 0) {
                numOfPos++;
            } else {
                numOfZero++;
            }
        }
        System.out.println("Number of negative values: "+ numOfNeg+"\n"+
                "Number of positive values: " + numOfPos + "\n" + "Number of zero values: "+ numOfZero);
    }
}
