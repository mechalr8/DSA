public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{24, 18, 38, 43, 14, 40, 1, 54};
        new QuickSortSolution().quickSort(arr, 0, 7);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}

class QuickSortSolution{
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void quickSort(int arr[], int low, int high){
        // code here
        if(low < high){
            int partIndex = partition(arr, low, high);
            quickSort(arr, low, partIndex-1);
            quickSort(arr, partIndex+1, high);
        }
    }
    
    // static int partition(int arr[], int low, int high){
    //     // your code here
    //     int pivot = arr[low];
    //     int i = low;
    //     int j = high;
    //     while(i < j){
    //         while(arr[i]<=pivot && i<=high-1){
    //             i++;
    //         }
    //         while(arr[j]>pivot && j>=low+1){
    //             j--;
    //         }
    //         if(i<j){
    //             swap(arr, i, j);
    //         }
    //     }
    //     swap(arr, low, j);
    //     return j;
    // }

    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int pIndex = low;
        for(int i=low; i<high; i++){
            if(arr[i] <= pivot){
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, high);
        return pIndex;
    }
}
