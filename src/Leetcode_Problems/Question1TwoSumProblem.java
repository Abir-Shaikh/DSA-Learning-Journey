import java.util.Arrays;


//using brute force approach
public class Question1TwoSumProblem {
    public static void main() {
        Solution obj = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println("Output: " + Arrays.toString(result));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1 ; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return  new  int[]{i , j};
                }
            }
        }
        return new int[]{};
    }
}