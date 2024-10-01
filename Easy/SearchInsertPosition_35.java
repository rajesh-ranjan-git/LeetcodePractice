public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};

        System.out.println(searchInsert(nums, 0));
    }
    
    public static int searchInsert(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                ans = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (ans == -1) {
            return 0;
        }
        
        return ans;
    }
}
