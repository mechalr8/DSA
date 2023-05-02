public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 72, 90, 21, 60};
        int n = 5;
        new ReverseArraySolution().reverse(arr, n);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}

class ReverseArraySolution{
    int i=0;
    int temp=0;
    void reverse(int[] arr, int n){
        while(i<n/2){
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
            i++;
            reverse(arr, n);
        }
    }
}
