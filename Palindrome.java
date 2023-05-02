public class Palindrome {
    public static void main(String[] args) {
        System.out.println(new Solution1().isPalindrome("ab"));
    }
}

/**
 * Solution
 */
class Solution1 {
    int isPalindrome(String s){
        int n = s.length();
        if(n==0){
            return 1;
        }
        return isPalindromeCheck(s, 0, n-1);
    }
    int isPalindromeCheck(String s, int i, int n){
        if(i==n)
            return 1;
        if((s.charAt(i)) != (s.charAt(n)))
            return 0;
        if(i < n+1)
            return isPalindromeCheck(s, i+1, n-1);
        return 1;
    }

}