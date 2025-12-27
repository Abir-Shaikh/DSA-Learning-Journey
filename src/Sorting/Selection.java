package Sorting;

public class Selection {
    public static void SelectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i <= n-2; i++) {
            int minIndex = i;

            for (int j = i; j <= n-1 ; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64 , 25 , 12 , 22 , 11 };
        SelectionSort(arr);

        System.out.print("Sorted Arrays : ");
        for (int num : arr){
            System.out.print(num + " ");
        }

    }
}
