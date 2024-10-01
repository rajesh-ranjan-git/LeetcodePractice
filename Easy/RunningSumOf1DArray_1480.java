public class RunningSumOf1DArray_1480 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};

        System.out.println(runningSum(nums));
    }
    
    public static int[] runningSum(int[] nums) {
        int sum[] = new int[nums.length];
        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        
        return sum;
    }
}