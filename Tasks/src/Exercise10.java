//Compress the array, discarding every second element from it (fill the vacated elements with zeros)
public class Exercise10 {
    public static void main(String[] args) {
        int n = 10;
        int[] num = new int[n];
        System.out.println("New array: ");
        for (int i = 0; i<num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.print(num[i]+",");
        }
        System.out.println();
        System.out.println("Array after changes: ");
        int zero = 0;
        int index = 0;
        for (int i=0; i<num.length; i++){
            if(index % 2 == 0){
                num[index] = zero;
            }
            System.out.print(num[index] + ",");
            index++;
        }
        System.out.println();
        System.out.println("Compressed array: ");

        for(int i = 1; i< num.length; i+=2){
            num[i-1] = num[i];
            System.out.print(num[i]+",");
        }
    }
}