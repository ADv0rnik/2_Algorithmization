//Replace all elements of the array greater than the given Z with this value. Show number of replacements
public class Exercise02 {
    public static void main(String[] args) {
        double [] num = {0.1, -1, 0.5, 3, 0.7, 2.5, 6, 3, 6.1, -0.2};
        int numOfReplace = 0;
        double z = 1.5;

        for(int i = 0; i < num.length; i++){
            if(num[i] > z){
                num[i]=z;
                numOfReplace++;
            }
            System.out.println(num[i]);
        }
        System.out.println("Number of replacements: "+ numOfReplace);
    }
}
