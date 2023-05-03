import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 35};
        int[] arr2 = {6, 9, 13, 15, 20, 25, 29, 46};
        int N = arr1.length;
        int M = arr2.length;

        ArrayList<Integer> arrLst = new UnionSolution().findUnion(arr1, arr2, N, M);
        for(int i: arrLst){
            System.out.print(i+" ");
        }
    }
}

class UnionSolution {
    public ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        // add your code here
        ArrayList<Integer> unionArrLst = new ArrayList<>();
        //Solution 1
        // HashMap <Integer,Integer > freq=new HashMap<>();
        // for (int i = 0; i < n; i++)
        //     freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
        // for (int i = 0; i < m; i++)
        //     freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        // for (int it: freq.keySet())
        //     Union.add(it);
        // Collections.sort(Union);
        
        // Solution 2
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < n; i++){
        //     set.add(arr1[i]);
        // }
        // for (int i = 0; i < m; i++)
        //     set.add(arr2[i]);
        // for(int i: set)
        //     Union.add(i);
        // Collections.sort(Union);
        
        int i=0, j=0;
        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                if(unionArrLst.size() == 0 || unionArrLst.get(unionArrLst.size()-1) != arr1[i])
                    unionArrLst.add(arr1[i]);
                i++;
            }
            else {
                if(unionArrLst.size() == 0 || unionArrLst.get(unionArrLst.size()-1) != arr2[j])
                    unionArrLst.add(arr2[j]);
                j++;
            }
        }
        
        while(i<n){
            if(unionArrLst.get(unionArrLst.size()-1) != arr1[i])
                unionArrLst.add(arr1[i]);
            i++;
        }
        
        while(j<m){
            if(unionArrLst.get(unionArrLst.size()-1) != arr2[j])
                unionArrLst.add(arr2[j]);
            j++;
        }
        return unionArrLst;
    }
}