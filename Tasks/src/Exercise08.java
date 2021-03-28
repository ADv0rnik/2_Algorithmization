public class Exercise08 {
    public static void main(String[] args) {
        int n = 20;
        int[]nums = new int[n];
        int searchKey = nums[0];
        int count = 0;

        for(int i: nums){
            nums[i] = (int)(Math.random()*100);
            System.out.println(nums[i]);
        }

        for (int num : nums) {
            if (num < searchKey) {
                searchKey = num;
                count++;
            }
        }
        System.out.println();
        System.out.println(searchKey);



    }
}
