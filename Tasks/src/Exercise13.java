import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//A matrix is given. Print the k-row and p-column of the matrix
public class Exercise13 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][]twoDimArray = {{4,5,6,0},{7,9,3,6},{9,2,0,1},{6,3,3,9}};
        try {
            System.out.println("Enter k-line number : ");
            int k = Integer.parseInt(reader.readLine());
            System.out.println("Enter p-column number : ");
            int p = Integer.parseInt(reader.readLine());
            for(int i= 0; i<twoDimArray.length; i++){
                for (int j = 0; j< twoDimArray.length; j++){
                    System.out.print(" "+ twoDimArray[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            if((k > twoDimArray.length)||(k < 0)||(p > twoDimArray.length)||(p < 0)){
                System.out.println("The line does not exist in the matrix");
            } else {
                System.out.println("k-line:");
                for(int i = 0; i<twoDimArray.length; i++){
                    System.out.print(" "+twoDimArray[k][i]+" ");
                }
                System.out.println();
                System.out.println("p-column:");
                for (int j = 0; j< twoDimArray.length; j++){
                    System.out.print(" "+twoDimArray[j][p]+" ");
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.out.println("Error: "+ e.toString());
        }
    }
}