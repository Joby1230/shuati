package Leetcode.Easy;

public class ValidPalindromeII {
    public static void main(String[] args) {
        ValidPalindromeII v=new ValidPalindromeII();
        System.out.println(v.validPalindrome("deeee"));
    }
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while (l<r){
            if (s.charAt(l)!=s.charAt(r)) return isPalindromic(s,l,r-1)||isPalindromic(s,l+1,r);
            l++;
            r--;
        }
        return true;
    }

    public boolean isPalindromic(String s, int l, int r) {
        while (l<r) {
            if (s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
