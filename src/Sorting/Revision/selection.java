package Sorting.Revision;

//[7 5 9 2 8] -> [7 _ _ 2 _] -> [2 5 9 7 8]

public class selection {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            for (int j = i+1; j < n; j++) {
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
        int[] arr = {7 , 5 , 9 , 2 , 8};
        selectionSort(arr);

        System.out.print("Sorted arrays  : ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
