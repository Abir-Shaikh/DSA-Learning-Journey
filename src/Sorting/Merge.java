package Sorting;

public class Merge {
    public static void MergeSort(int[] arr , int low , int high){
        //int n = arr.length;
        if (low < high) {
            int mid = (low + high) / 2;
            MergeSort(arr, low , mid);
            MergeSort(arr , mid + 1 , high);
            merge(arr, low ,mid , high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1 ;
        int n2 = high - mid;

        int LeftArr[] = new int[n1];
        int RightArr[] = new int[n2];

        //Data Copy
        for (int i = 0; i < n1; i++) {
            LeftArr[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            RightArr[i] = arr[mid + 1 + i];
        }

        //local variable
        int i = 0 ;
        int j = 0;
        int k = low;

        //just Merging
        while (i < n1 && j < n2){
            if (LeftArr[i] <= RightArr[j]) {
                arr[k] = LeftArr[i];
                i++;
            }
            else {
                arr[k] = RightArr[i];
                j++;
            }
            k++;

        }

        //This part is merging all the remaining arrays and merging it.
        while (i < n1){
            arr[k] = LeftArr[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = RightArr[j];
            j++;
            k++;
        }
    }



    public static void main(String[] args) {
        int[] arr = {64 , 25 , 12 , 22 , 11 };
        MergeSort(arr , 0 , arr.length -1 );

        System.out.print("Sorted Arrays : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
