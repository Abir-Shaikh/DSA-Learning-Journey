import java.util.Arrays;

public class Question905SortArraysByPairity {
    public static void main(String[] args) {

        Solution1 obj = new Solution1();

        int[] nums = {3, 1, 2, 4};

        int[] result = obj.sortArrayByParity(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}

class Solution1 {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }

        return nums;
    }
}
