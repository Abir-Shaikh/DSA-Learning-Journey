package Sorting;

public class Quick {
    public static void  QuickSort(int[] arr , int low , int high){
        //algorithm for quick sort
        if (low < high) {
            int PartitionIndex = Partition(arr , low , high);
            QuickSort(arr , low ,PartitionIndex - 1);
            QuickSort(arr , PartitionIndex + 1 , high);
        }
    }


    public static int Partition(int[] arr, int low, int high) {
        //64 25 12 22|11
        int Pivot = arr[high];
        //track even the smallest  element
        int i = low - 1;

        //j scans or traverse the whole array
        for (int j = low; j < high ; j++) {
            if (arr[j] < Pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {64 , 25 , 12 , 22 , 11 };
        QuickSort(arr , 0 , arr.length -1 );

        System.out.print("Sorted Arrays : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
