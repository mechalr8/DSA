import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {

        int[] A = {3,3,4,4,5,8};
        int[] B = {1,2,3,3,4,5,6,7};
        
        ArrayList<Integer> arrLst = new IntersectionSolution().findIntersection(A, B);
        for(int i: arrLst)
            System.out.print(i+" ");
        
    }
}

class IntersectionSolution{
    public ArrayList<Integer> findIntersection(int[] A, int[] B){
        ArrayList<Integer> intersectionArrLst = new ArrayList<>();
        int n = A.length;
        int m = B.length;
        // int[] visitedArr = new int[m];

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.println("A["+i+"]="+A[i]);
        //         System.out.println("B["+j+"]="+B[j]);
        //         System.out.println("visitedArr["+j+"]="+visitedArr[j]);
        //         if(A[i] == B[j] && visitedArr[j] == 0){
        //             intersectionArrLst.add(B[j]);
        //             visitedArr[j] = 1;
        //             break;
        //         }
        //         else if(B[j] > A[i])
        //             break;
        //     }
        // }

        int i=0, j=0;

        while(i < n && j < m){
            if(A[i]>B[j])
                j++;
            else if(A[i]<B[j])
                i++;
            else{
                intersectionArrLst.add(A[i]);
                i++;
                j++;
            }
        }
        return intersectionArrLst;
    }
}