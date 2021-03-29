/*
In an array of integers with length n find the most common number.
If there are more than one of these numbers, define the smallest one.
*/
public class Exercise09 {
    public static void main(String[] args) {
        int n = 10;
        int[] num = new int[n];
        for (int i = 0; i<num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.println(num[i]);
        }
        int repeatedNum = num[0];
        int repCount = 1;
        int count = 0;
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length; j++){
                if(num[i]==num[j]){
                    count++;
                }
            }
            if(((repCount == count) && (repeatedNum>num[i])) || (repCount<count)){
                repeatedNum = num[i];
                repCount = count;
            }
            count = 0;
        }
        System.out.println();
        System.out.println("Repeated number is: " + repeatedNum + "\n"+ "With number of counts: " + repCount);//wtf?
    }
}