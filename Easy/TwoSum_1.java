public class TwoSum_1 {
    public static void main(String[] args) {
        // int[] nums = { 2, 7, 11, 15 };
        int nums[] = { 3, 2, 3 };

        printArray(twoSum(nums, 6));
    }

    static void printArray(int arr[]) {
        System.out.print("arr : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        System.out.println();
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        
        return indices;
    }
}
