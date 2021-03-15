//Print only those numbers for which ai> i
public class Exercise05 {
    public static void main(String[] args) {
        double []num = {0.2, 4, 1.8, 2, 4.3, 4.5, 8, 5.8, 6.9, 12.3};

        for(int i =0; i<num.length; i++){
            if(i < num[i]){
                System.out.println(num[i]);
            }
        }
    }
}
