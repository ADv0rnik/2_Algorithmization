import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Create a square matrix of order n according to a given pattern (n is even):
        | 1	2	3	...	n |
        | n	n-1	n-2	...	1 |
        | 1	2	3	...	n |
        | n	n-1	n-2	...	1 |
        | 1	2	3	...	n |
        | n	n-1	n-2	...	1 | */

public class Exercise14 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = 1;
        try {
            int n = Integer.parseInt(reader.readLine());
            int m = n;
            int[][]matrix = new int[n][n];
            for(int i = 0; i< matrix.length; i++){
                if(i%2 == 0){
                    for (int j = 0; j<matrix.length; j++){
                        matrix[i][j] = k;
                        k++;
                    }k = 1;
                } else {
                    for (int j = 0; j<matrix.length; j++){
                        matrix[i][j] = m;
                        m--;
                    } m = n;
                }
            }
            for(int i = 0; i< matrix.length; i++){
               for (int j = 0; j<matrix.length; j++){
                   System.out.print(" " + matrix[i][j]+ " ");
               }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}