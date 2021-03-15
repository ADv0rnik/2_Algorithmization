//Swap the largest and smallest elements in array
public class Exercise04 {
    public static void main(String[] args) {
        double[]num = {0.1, 5, 1.9, 1, 0.3, 6.2, 7, 2.3, 2, 9.5};
        double maxElement = num[0];
        double minElement = num[0];
        System.out.println("Array before swapping: ");
        for(double i: num){
            if(num[(int) i]>maxElement){
                maxElement = num[(int) i];
            }
            if (num[(int) i] < minElement) {
                minElement = num[(int) i];
            }
            System.out.println(i);
        }
        double tmp = num[(int) minElement];
        num[(int) minElement] = num[(int)maxElement];
        num[(int)maxElement] = tmp;
        System.out.println("Array after swapping: ");
        for(double i: num){
            System.out.println(i);
        }
    }
}