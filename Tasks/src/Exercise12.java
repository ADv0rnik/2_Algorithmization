//A square matrix is given. Display all elements on a diagonal

public class Exercise12 {
    public static void main(String[] args) {
        int[][]twoDimArray ={{1,2,3},{1,5,1},{2,1,1}};
        for (int[] ints : twoDimArray) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i =0; i<twoDimArray.length; i++){
                System.out.print(" "+ twoDimArray[i][i] + " ");
        }
    }
}