public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 3, 9, 7};
        int n = 5;
        new SelectionSortSolution().selectionSort(arr, n);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}

class SelectionSortSolution {

    /*-----------------------------Without Recursion-----------------------------*/
    // int  select(int arr[], int i){
    //     // code here such that selectionSort() sorts arr[]
    //     int min = arr[i];
    //     for(int j=i; j<arr.length; j++){
    //         if(min >= arr[j])
    //             min = arr[j];
    //     }
    //     return min;
	// }
	
	// int findIndex(int arr[], int i, int a){
	//     int index = 0;
	//     for(int j=i; j<arr.length; j++){
    //         if(arr[j] == a)
    //             index = j;
    //     }
    //     return index;
	// }
	
	// void selectionSort(int arr[], int n){
	//     //code here
	//     int a = 0;
	//     int index = 0;
	//     for(int i=0; i<n-1; i++){
	//         a = select(arr, i);
	//         index = findIndex(arr, i, a);
	//         arr[index] = arr[i];
	//         arr[i] = a;
	//     }
	// }

    /*-----------------------------With Recursion-----------------------------*/
    int select(int arr[], int i){
        int indexMin = i;
        for(int j=i; j<arr.length; j++){
            if(arr[j] < arr[indexMin]){
                indexMin = j;
            }
        }
        return indexMin;
    }

    int k=0, temp=0, minIndex=0;

    void selectionSort(int arr[], int n){
        while(k<n){
            minIndex = select(arr, k);
            temp = arr[k];
            arr[k] = arr[minIndex];
            arr[minIndex] = temp;
            k++;
            selectionSort(arr, n);
        }
    }
}