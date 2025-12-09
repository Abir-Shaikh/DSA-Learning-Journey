public class Question136SingleNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(Question136SingleNumber(nums));
    }
    public static int Question136SingleNumber(int[] nums) {
        int n = nums.length;
        int result = 0;
        for(int i = 0 ; i < n ; i ++){
            result = result^nums[i];
        }
        return result;
    }
}