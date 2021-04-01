public class Exercise11 {
    public static void main(String[] args) {
        int[][]twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        for(int i = 0; i<twoDimArray.length; i++){
            for (int j=0; j< twoDimArray[0].length; j++){
                System.out.print(" "+twoDimArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
