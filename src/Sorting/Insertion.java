package Sorting;

public class Insertion {
    public static void InsertionSort(int[] arr){

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64 , 25 , 12 , 22 , 11 };
        InsertionSort(arr);

        System.out.print("Sorted Arrays : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
