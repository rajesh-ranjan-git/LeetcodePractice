public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums = { 1, 1, 2 };

        System.out.println(removeDuplicates(nums));
    }
    
    public static int removeDuplicates(int[] nums) {
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
