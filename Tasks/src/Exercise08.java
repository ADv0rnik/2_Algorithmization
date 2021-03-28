  /*
  Given a sequence of integers a1,a2,...,a_n.
  Create a new sequence by removing from the
  original those elements that are correspond
  to min(a1,a2, ,an).
  */

public class Exercise08 {
    public static void main(String[] args) {
        int n = 10;
        int[] numbs = new int[n];
        int count = 0;
        //set random array of integer
        System.out.println("Array of integers before removing:");
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = (int) (Math.random() * 100);
            System.out.println(numbs[i]);
        }
        int searchKey = numbs[0];
        for (int num: numbs){
            if(num < searchKey){
                searchKey = num;
            }
        }
        //define min value
        for(int i: numbs){
            if(i == searchKey){
                count++;
            }
        }
        //set new array
        int[]res = new int[numbs.length-count];
        int index = 0;
        for (int value : numbs) {
            if (value > searchKey) {
                res[index++] = value;
            }
        }
        System.out.println("Array of integers after removing:");
        for (int re : res) {
            System.out.println(re);
        }
    }
}