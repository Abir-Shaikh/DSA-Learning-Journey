//Problem Statement: Given an array, find the second smallest and second largest element in the array.
// Print ‘-1’ in the event that either of them doesn’t exist.
/*

Example1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
 Second Largest : 5

 Example 2:
Input: [1]
Output: Second Smallest : -1
 Second Largest : -1

 Example3:
Input: [3,3,3]
Output: second largest:-1
 second smallest: -1

---------------------------------------------------------------------------------------------------------------------
 To solve this we have two or three approach

 Approach 1 --> Naive/Brute force approach
  ~use sorting . sort the array and then get the last element of the array done.
  ~Time complexity : depends on sorting algo - merge sort - O(n*logn)
  ~space complexity : O(n)             n = no of elements in a array

 */
package Arrays;

import java.util.Arrays;
public class Question2 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
        int max1 = arr[0];
        int max2 = arr[0];

        Arrays.sort(arr);


        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] != max1) {
                max2 = arr[i];
                break;
            }
        }
        System.out.println("The Second Largest element is : " + max2);
    }

}
