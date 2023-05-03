import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i=0; i<N-1; i++){
                A[i] = sc.nextInt();
            }
            System.out.println(new MissingNumberSolution().missingNumber(A, N));
        }
    }
}

class MissingNumberSolution{
    public int missingNumber(int A[], int N){
        // Your code goes here

        // int a = 1;
        // int res = 0;
        // for(int i=0; i<N; i++){
        //     if(a == A[i]){
        //         a++;
        //         i = -1;
        //     }
        //     if(i==N-1 && a != A[i]){
        //         res = a;
        //     }
        // }
        // return res;

        int sumExpect = (N+1)*(N)/2;
        int sumActual = 0;
        for(int i=0; i<A.length; i++){
            sumActual += A[i];
        }
        return (sumExpect - sumActual);
    }
}
