package Sorting.Revision;

public class insertion {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {14 , 9 , 15 , 6 , 8 , 13};
        insertionSort(arr);

        System.out.print("Sorted Arrays : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
