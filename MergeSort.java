public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6, 7};
        new MergeSortSolution().mergeSort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}

class MergeSortSolution
{
    void merge(int[] L, int[] R, int[] A){
        int nL = L.length;
        int nR = R.length;
        int i = 0, j = 0, k = 0;

        while(i < nL && j < nR){
            if(L[i] <= R[j]){
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
            k++;

            // Print Array L after every recursion
            System.out.print((k)+" Array A: ");
            for(int a: A){
                System.out.print(a+" ");
            }
            System.out.println();

        }

        while(i < nL){
            A[k] = L[i];
            i++;
            k++;

            // Print Array A after every recursion
            System.out.print((k)+" Array A: ");
            for(int a: A){
                System.out.print(a+" ");
            }
            System.out.println();

        }

        while(j < nR){
            A[k] = R[j];
            j++;
            k++;

            // Print Array A after every recursion
            System.out.print((k)+" Array A: ");
            for(int a: A){
                System.out.print(a+" ");
            }
            System.out.println();

        }
    }

    void mergeSort(int[] arr){
        int n = arr.length;
        if(n<2)
            return;
        int mid = n/2;
        int[] L = new int[mid];
        int[] R = new int[n-mid];

        // Update Array L after every recursion
        for(int i = 0; i < mid; i++)
            L[i] = arr[i];

        // Print Array L after every recursion
        System.out.print("Array L: ");
        for(int k: L)
            System.out.print(k+" ");
        System.out.println();

        // Update Array R after every recursion
        for(int i = mid; i < n; i++)
            R[i-mid] = arr[i];

        // Print Array L after every recursion
        System.out.print("Array R: ");
        for(int k: R)
            System.out.print(k+" ");
        System.out.println();

        mergeSort(L);
        mergeSort(R);
        merge(L, R, arr);
    }
}
