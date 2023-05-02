public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6, 7};
        int n = 6;
        new BubbleSortSolution().bubbleSort(arr, n);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}

class BubbleSortSolution
{
    /*-----------------------------Without Recursion-----------------------------*/
	// public void bubbleSort(int arr[], int n){
    //     int temp = 0;
    //     for(int i=0; i<n; i++){
            // for(int j=0; j<n-1-i; j++){
            //     if(arr[j] > arr[j+1]){
                    // temp = arr[j+1];
                    // arr[j+1] = arr[j];
                    // arr[j] = temp;
            //     }
            // }
    //     }
    // }

    /*-----------------------------With Recursion-----------------------------*/

    public void bubble(int arr[], int i){
        int n = arr.length;
        int temp = 0;
        for(int j=0; j<n-1-i; j++){
            if(arr[j] > arr[j+1]){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }

    int i=0;

    public void bubbleSort(int arr[], int n){
        while(i<n-1){
            bubble(arr, i);
            i++;
            bubbleSort(arr, n-i);
        }
    }
}