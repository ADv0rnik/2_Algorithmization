public class Exercise10 {
    public static void main(String[] args) {
        int n = 10;
        int[] num = new int[n];
        for (int i = 0; i<num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.println(num[i]);
        }
        System.out.println();
        int zero = 0;
        int index = 0;
        for (int i=0; i<num.length; i++){
            if(index % 2 == 0){
                num[index] = zero;
            }
            System.out.println(num[index]);
            index++;
        }
    }
}
