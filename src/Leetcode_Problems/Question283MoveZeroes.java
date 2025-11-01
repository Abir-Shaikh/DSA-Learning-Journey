package Leetcode_Problems;

public class Question283MoveZeroes {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        //int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {0};

        solution.moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
class Solution1 {
    public void moveZeroes(int[] nums) {

        int nonzero = 0;
        for (int zero = 0; zero < nums.length; zero++) {
            if (nums[zero] != 0) {
                int temp = nums[zero];
                nums[zero] = nums[nonzero];
                nums[nonzero] = temp;
                nonzero++;
            }
        }
    }
}