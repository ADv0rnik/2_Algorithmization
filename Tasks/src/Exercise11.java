//A matrix is given. Display all odd columns with the first item greater than the last.
public class Exercise11 {
    public static void main(String[] args) {
        int[][]twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        System.out.println("The matrix: ");
        for (int[] ints : twoDimArray) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Desired column: ");
        for (int[] ints : twoDimArray) {
            for (int j = 0; j < twoDimArray[0].length; j += 2) {
                if (twoDimArray[0][j] > twoDimArray[twoDimArray.length - 1][j])
                    System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
    }
}