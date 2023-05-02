import java.util.*;

public class Factorials {
    public static void main(String[] args) {
        System.out.println(new Solution().factorialNumbers(25));
    }
}

class Solution{
    ArrayList<Long> arr = new ArrayList<>();
    ArrayList<Long> factorialNumbers(long N){
        int n = arr.size();
        if(n > 0){
            if(arr.get(n-1) < N){
                long fac = arr.get(n-1) * (n+1);
                if(fac <= N){
                    arr.add(fac);
                    return factorialNumbers(N);
                } else {
                    return arr;
                }
            }
            else {
                return arr;
            }
        }
        else{
            arr.add(1L);
            return factorialNumbers(N);
        }
    }
}