//Problem Statement: Given an array, we have to find the largest element in the array.

/*to solve this we have two approach
  Approach 1 --> Naive/Brute force approach
  ~use sorting . sort the array and then get the last element of the array done.
  ~Time complexity : depends on sorting algo - merge sort - O(n*logn)
  ~space complexity : O(n)             n = no of elements in a array




  Approach 2 --> take a variable "Largest" which will keep the track of the maximum or largest element
                        discoverd while traversing over the array.

* */
package Arrays;
import java.util.Arrays;





public class Question1 {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};


//Approach 1
        Arrays.sort(arr);
        int largest1 = arr[arr.length - 1];


//Approach 2
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element is :" + largest);
        System.out.println("The largest element is :" + largest1);
    }
}

