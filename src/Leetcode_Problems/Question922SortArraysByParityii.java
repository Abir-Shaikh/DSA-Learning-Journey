import java.util.Arrays;

public class Question922SortArraysByParityii {
    public static void main() {
        solution3 obj = new solution3();

        int[] nums = {4, 2, 5, 7};
        int[] result = obj.SortArrayByParityii(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
class solution3{
    public int[] SortArrayByParityii(int[] nums){
        int evenindex = 0;
        int oddindex = 1;
        int n = nums.length;

        while(evenindex < n && oddindex < n){
            while(evenindex < n && nums[evenindex] % 2 == 0){
                evenindex += 2;
            }
            while(oddindex < n && nums[oddindex] % 2 == 1){
                oddindex += 2;
            }
            if(evenindex < n && oddindex < n){
                int temp = nums[evenindex];
                nums[evenindex] = nums[oddindex];
                nums[oddindex] = temp;
            }
        }
        return nums;
    }
}
