public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6, 7};
        int n = 6;
        new InsertionSortSolution().insertionSort(arr, n);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}

class InsertionSortSolution{

    public void insert(int[] arr, int i){
        int temp = 0;
        for(int j=i; j>0; j--){
            if(arr[j] < arr[j-1]){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                System.out.print(j+":"+i+"-> ");
                for(int k: arr){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }

    int k=0;

    public void insertionSort(int[] arr, int n){
        while(k<n){
            insert(arr, k);
            k++;
            insertionSort(arr, n-k);
        }
    }
}